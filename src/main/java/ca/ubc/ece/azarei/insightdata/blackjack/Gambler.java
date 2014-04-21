/**
 * This abstract class models a general superclass for player and dealer in the Blackjack game.
 * Dealer's and Player's commonalities are abstracted into this class.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public abstract class Gambler {

	/**
	 * @param table
	 * @return
	 */
	public abstract boolean play(Table table);

	public abstract boolean hit(Table table);

	public abstract boolean stand(Table table);

}
