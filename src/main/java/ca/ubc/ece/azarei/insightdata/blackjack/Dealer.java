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

	/**
	 * An action: either hit or stand
	 */
	@Override
	public void act(Table table) {
		try {
			BlackjackGame.getUi().showOutput("Dealer hit!");
			this.hit(table);
			BlackjackGame.getUi().showOutput(
			        "Dealer's hand: " + this.getHand().getVisibleCards().toString());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}

	/**
	 * @return the limit that forces a dealer to stop hitting.
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Gambler#getAutoStandLimit()
	 */
	@Override
	public int getAutoStandLimit() {
		return DEALER_AUTO_STAND_LIMIT;
	}

}
