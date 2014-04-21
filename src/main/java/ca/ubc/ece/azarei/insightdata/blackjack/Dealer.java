/**
 * This class models the dealer in a Blackjack game. The dealer is a special type of
 * {@link Gambler.java} which plays as the last gambler. She hits until she has 17 or higher in her
 * hand. Everyone else in playing against her; The dealer's hand at the beginning is such as one
 * card is face up and one is face down.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public class Dealer extends Gambler {

	/*
	 * (non-Javadoc)
	 * @see
	 * ca.ubc.ece.azarei.insightdata.blackjack.Gambler#play(ca.ubc.ece.azarei.insightdata.blackjack
	 * .Table)
	 */
	@Override
	public boolean play(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * ca.ubc.ece.azarei.insightdata.blackjack.Gambler#hit(ca.ubc.ece.azarei.insightdata.blackjack
	 * .Table)
	 */
	@Override
	public boolean hit(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * ca.ubc.ece.azarei.insightdata.blackjack.Gambler#stand(ca.ubc.ece.azarei.insightdata.blackjack
	 * .Table)
	 */
	@Override
	public boolean stand(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

}
