/**
 * This class models a card in a game card. Cards have suits and ranks. The value of the card is
 * dictate by the game and the state of the game being played.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public class Card {

	private final CardSuit suit;
	private final CardRank rank;

	/**
	 * The constructor of Card class
	 */
	public Card(CardSuit suit, CardRank rank) {

		this.suit = suit;
		this.rank = rank;

	}

	/**
	 * @return the rank
	 */
	public CardRank getRank() {
		return rank;
	}

	/**
	 * @return the suit
	 */
	public CardSuit getSuit() {
		return suit;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		StringBuffer text = new StringBuffer();
		text.append(String.format("%-10s", this.suit.toString()));
		text.append(String.format("%5d", this.rank.getRank()));

		return text.toString();
	}
}
