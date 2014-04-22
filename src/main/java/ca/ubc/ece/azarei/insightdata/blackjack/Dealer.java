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

	private static final int DEALER_AUTO_STAND_LIMIT = 17;

	/**
     * 
     */
	public Dealer() {

		this.setHand(new DealerHand());

	}

	@Override
	public void act(Table table) {
		try {
			this.hit(table);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Gambler#getAutoStandLimit()
	 */
	@Override
	public int getAutoStandLimit() {
		return DEALER_AUTO_STAND_LIMIT;
	}

}
