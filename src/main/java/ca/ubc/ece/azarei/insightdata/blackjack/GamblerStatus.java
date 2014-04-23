/**
 * This enum models various states a player could go to in a Blackjack game
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public enum GamblerStatus {

	BUSTED("Went over 21"), BLACKJACK("Blackjack"), CAN_HIT("Still can hit"), STAND("Stand"),
	WON("Won"), LOST("Lost"), PUSH("Push");

	private final String status;

	private GamblerStatus(String s) {
		status = s;
	}

	public String getStatus() {
		return status;
	}

}
