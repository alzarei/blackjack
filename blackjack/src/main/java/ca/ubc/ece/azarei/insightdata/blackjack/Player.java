/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.Currency;

/**
 * @author Alexander Zarei
 *
 */
public abstract class Player extends Gambler {

	public abstract boolean split(Table table);
	public abstract boolean doubleDown(Table table);
	public abstract Currency bet(Table table);


}
