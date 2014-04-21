/**
 * This enumeration models cards' ranks in a game card.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public enum CardRank {

	DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10),
	QUEEN(10), KING(10), ACE(1);

	/**
	 * @param text
	 */
	private CardRank(final int rank) {
		this.rank = rank;
	}

	private final int rank;

	public int getRank() {
		return rank;
	}
}
