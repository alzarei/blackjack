/**
 * This class models a player's or dealer's hand. A hand is a number of {@link Card.jav}s that the
 * gambler is playing with. A {@link Gambler.java}'s hand states who is the winner at the end of a
 * {@link Round.java}.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.ArrayList;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author Alexander Zarei
 */
public class Hand {

	private ArrayList<Card> visibleCards;
	private int handPoints;

	/**
     * 
     */
	public Hand() {

		visibleCards = new ArrayList<Card>();

	}

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

	/**
	 * @return
	 */
	public ArrayList<Card> getAllCards() {

		return getVisibleCards();
	}

	/**
	 * @param handPoints
	 *            the handPoints to set
	 */
	public void setHandPoints(int handPoints) {
		this.handPoints = handPoints;
	}

	/**
	 * @return the handPoints
	 */
	public int getHandPoints() {
		return handPoints;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).
		        append("Cards", visibleCards).
		        toString();
	}
}
