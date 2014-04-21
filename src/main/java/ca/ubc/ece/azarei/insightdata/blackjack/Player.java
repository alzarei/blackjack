/**
 * This class models a Blackjack player.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.Currency;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Alexander Zarei
 */
public abstract class Player extends Gambler {

	private static AtomicInteger idGenerator = new AtomicInteger(0);

	private Hand hand;

	public abstract boolean split(Table table);

	public abstract boolean doubleDown(Table table);

	public abstract Currency bet(Table table);

	/**
	 * @param hand
	 *            the hand to set
	 */
	public void setHand(Hand hand) {
		this.hand = hand;
	}

	/**
	 * @return the hand
	 */
	public Hand getHand() {
		return hand;
	}

	/*
	 * (non-Javadoc)
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Gambler#determineStatus()
	 */
	@Override
	public GamblerStatus determineStatus() {
		// TODO Auto-generated method stub
		return null;
	}
}
