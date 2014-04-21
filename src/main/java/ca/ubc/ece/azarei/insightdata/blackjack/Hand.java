/**
 * This class models a player's or dealer's hand. A hand is a number of {@link Card.jav}s that the
 * gambler is playing with. A {@link Gambler.java}'s hand states who is the winner at the end of a
 * {@link Round.java}.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.ArrayList;

/**
 * @author Alexander Zarei
 */
public abstract class Hand {

	private ArrayList<Card> visibleCards;

	/**
	 * @return the visibleCards
	 */
	public ArrayList<Card> getVisibleCards() {
		return visibleCards;
	}

	/**
	 * @param visibleCards
	 *            the visibleCards to set
	 */
	public void setVisibleCards(ArrayList<Card> visibleCards) {
		this.visibleCards = visibleCards;
	}

	/**
	 * adds a card to hand. The card will be seen by other users as well.
	 * 
	 * @param card
	 * @return true if the card was added and false if the input was card null.
	 */
	public boolean addCard(Card card) {

		if (card == null)
			return false;
		else {
			getVisibleCards().add(card);
		}
		return true;

	}

}
