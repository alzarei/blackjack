/**
 * This class models a deckshoe for blackjack game containing a number of 52-decks.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.ArrayList;
import java.util.Collections;

import ca.ubc.ece.azarei.insightdata.blackjack.expetions.NegativeNumberOfDecksExeption;

/**
 * @author Alexander Zarei
 */
public class DeckShoe {

	private ArrayList<Card> cards;
	private int numberOfDecks;

	/**
     * 
     */
	public DeckShoe() {
	}

	/**
	 * @throws NegativeNumberOfDecksExeption
	 */
	public DeckShoe(int howManyDecks) throws NegativeNumberOfDecksExeption {
		cards = new ArrayList<Card>();

		numberOfDecks = howManyDecks;

		if (numberOfDecks < 0) {
			throw new NegativeNumberOfDecksExeption("the initial number of decks is negative: "
			        + numberOfDecks);
		}

		for (int i = 0; i < numberOfDecks; i++) {
			Deck deck = new Deck();
			cards.addAll(deck.getCards());

		}

	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}

	public Card getNextCard() {
		if (isEmpty()) {
			return null;
		} else {
			Card next = cards.get(0);
			cards.remove(0);
			return next;
		}

	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		StringBuffer text = new StringBuffer();
		for (Card card : cards) {
			text.append(card.toString());
			text.append('\n');
		}

		return text.toString();
	}

	/**
	 * @return the cards
	 */
	public ArrayList<Card> getCards() {
		return cards;
	}

	/**
	 * @return the numberOfDecks
	 */
	public int getNumberOfDecks() {
		return numberOfDecks;
	}

	/**
	 * @param cards
	 *            the cards to set
	 */
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	/**
	 * @param numberOfDecks
	 *            the numberOfDecks to set
	 */
	public void setNumberOfDecks(int numberOfDecks) {
		this.numberOfDecks = numberOfDecks;
	}
}
