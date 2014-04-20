/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 *
 */
public abstract class Gambler {
	
	/**
	 * 
	 * @param table
	 * @return
	 */
	public abstract boolean play(Table table);
	public abstract boolean hit(Table table);
	public abstract boolean stand(Table table);


}
