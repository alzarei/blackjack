/**
 * This class models a 52 card deck containing 4 suits and ranks from ace to 10 and jack, queen and
 * king.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.ArrayList;

/**
 * @author Alexander Zarei
 */
public class Deck {

	private ArrayList<Card> cards;

	/**
     * 
     */
	public Deck() {

		this.cards = getA52Deck();

	}

	public boolean isEmpty() {
		return getCards().isEmpty();
	}

	/**
	 * /** This method is useful in generating all cards in a loop
	 * 
	 * @return all suits in the card deck
	 */
	public static CardSuit[] getAllSuits() {
		return CardSuit.class.getEnumConstants();
	}

	/**
	 * This method is useful in generating all cards in a loop
	 * 
	 * @return all ranks in the card deck.
	 */

	public static CardRank[] getAllRanks() {
		return CardRank.class.getEnumConstants();
	}

	/**
	 * Creates all 52 cards and pack them in an ArrayList
	 * 
	 * @return A full deck of cards
	 */
	public static ArrayList<Card> getA52Deck() {

		ArrayList<Card> aFullOrderedDeck = new ArrayList<Card>(52);

		for (CardSuit s : getAllSuits()) {
			for (CardRank r : getAllRanks()) {
				aFullOrderedDeck.add(new Card(s, r));
			}
		}

		return aFullOrderedDeck;
	}

	/**
	 * @return the cards
	 */
	public ArrayList<Card> getCards() {
		return cards;
	}

	/**
	 * @param cards
	 *            the cards to set
	 */
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		StringBuffer text = new StringBuffer();
		for (Card card : getCards()) {
			text.append(card.toString());
			text.append('\n');
		}

		return text.toString();
	}
}
