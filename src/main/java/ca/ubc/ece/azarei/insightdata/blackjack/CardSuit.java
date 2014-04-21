/**
 * This enumeration models cards' suits in a card game.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public enum CardSuit {
	SPADES("Spades"), HEARTS("Hearts"), DIAMONDS("Diamonds"), CLUBSS("Clubs");

	private final String name;

	/**
 * 
 */
	private CardSuit(String name) {

		this.name = name;
	}

	/**
	 * String representation
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {

		return this.name;
	}
}
