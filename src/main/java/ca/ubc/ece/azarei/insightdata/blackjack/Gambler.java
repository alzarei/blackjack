/**
 * This abstract class models a general superclass for player and dealer in the Blackjack game.
 * Dealer's and Player's commonalities are abstracted into this class.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import static ca.ubc.ece.azarei.insightdata.blackjack.BlackjackGame.ACE_OFFSET;
import static ca.ubc.ece.azarei.insightdata.blackjack.BlackjackGame.FACE_OR_TEN_RANK_VALUE;
import static ca.ubc.ece.azarei.insightdata.blackjack.BlackjackGame.SOFT_HAND_LIMIT;
import static ca.ubc.ece.azarei.insightdata.blackjack.BlackjackGame.TWIENTY_ONE;

import java.util.ArrayList;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author Alexander Zarei
 */
public abstract class Gambler {

	private GamblerStatus status;
	private Hand hand;

	/**
     * 
     */
	public Gambler() {

		status = GamblerStatus.CAN_HIT;

	}

	/**
	 * When this is the player or dealers turn this method carries out an act and update the status
	 * of the player or the dealer
	 * 
	 * @param table
	 * @return true if the gambler could play correctly, and false otherwise.
	 */
	public boolean play(Table table) {

		if (table == null)
			return false;

		updateGamblerStatus();
		while (status == GamblerStatus.CAN_HIT) {
			this.act(table);
			updateGamblerStatus();
		}

		return true;
	}

	/**
	 * This method updates the status of the player as well as the count of the points in her hand.
	 * This method does this updates solely by looking at what cards are the hand of the player
	 * 
	 * @return The updated status of the user
	 */

	public GamblerStatus updateGamblerStatus() {

		if (status != GamblerStatus.CAN_HIT) {
			return status;
		}

		int pointCount = 0;
		int aceCount = 0;
		int faceOrTenCount = 0;
		ArrayList<Card> allCards = this.getHand().getAllCards();
		int numberOfcards = allCards.size();

		// Counting the points and the Aces
		for (Card card : allCards) {

			switch (card.getRank()) {
				case ACE:
					aceCount++;
					break;
				case TEN:
				case KING:
				case QUEEN:
				case JACK:
					faceOrTenCount++;
					break;
				default:
					pointCount += card.getRank().getRank();
					break;
			}
		}

		// check for blackjack
		if ((numberOfcards == 2) && (faceOrTenCount == 1) && (aceCount == 1))
		{
			status = GamblerStatus.BLACKJACK;
		} else {
			// calculate points in the hand
			// calculate faces as ten points and aces as one point
			pointCount += FACE_OR_TEN_RANK_VALUE * faceOrTenCount + aceCount;

			// add ace offsets (ten extra points) while it does not bust
			for (int i = 0; i < aceCount; i++) {
				if (pointCount <= SOFT_HAND_LIMIT) {
					pointCount += ACE_OFFSET;
				} else {
					break;
				}
			}

			// determine status based on total points in the hand
			if (pointCount > TWIENTY_ONE) {
				status = GamblerStatus.BUSTED;
			} else if (pointCount >= getAutoStandLimit()) {
				// now it did not bus check if it reached the maximum; 21 for player and 17 or above
				// for dealer;

				status = GamblerStatus.STAND;
			} else {
				// it is a normal hand so the gambler can still hit!
				status = GamblerStatus.CAN_HIT;
			}
		}
		// update the points
		this.getHand().setHandPoints(pointCount);
		return status;
	}

	/**
	 * Takes a card from the deckshoe
	 * 
	 * @param table
	 *            : the current status of the game
	 * @throws Exception
	 */
	public void hit(Table table) throws Exception {

		Card card = table.getDeckShoe().getNextCard();
		if (card == null) {
			throw new Exception("Deckshoe was Empty!!");
		}
		this.getHand().addCard(card);
		BlackjackGame.getUi().showOutput(String.format("Hit result: %s", card.toString()));

	}

	/**
	 * sets the status of the Gambler to "stand".
	 * 
	 * @param table
	 */
	public void stand(Table table) {
		this.setStatus(GamblerStatus.STAND);
	}

	/**
	 * Carries out an action based on the status of the dealer or the will of a human player or the
	 * strategies of a machine player.
	 * 
	 * @param table
	 */
	public abstract void act(Table table);

	/**
	 * @return the status
	 */
	public GamblerStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(GamblerStatus status) {
		this.status = status;
	}

	/**
	 * @return The limit which prevents a gambler from hitting (21 or above for player and 17 or
	 *         above for dealer)
	 */
	public abstract int getAutoStandLimit();

	/**
	 * @param hand
	 *            the hand to set
	 */
	public void setHand(Hand hand) {
		this.hand = hand;
	}

	/**
	 * @return the hand
	 */
	public Hand getHand() {
		return hand;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).
		        append("Status", status).
		        append("Hand", hand).
		        toString();

	}

}
