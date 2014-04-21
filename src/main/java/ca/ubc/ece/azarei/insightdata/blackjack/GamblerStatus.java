/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public enum GamblerStatus {

	BUSTED("Went over 21"), BLACKJACK("Blackjack"), CAN_HIT("Still can hit"), STAND("Stand");

	private final String status;

	private GamblerStatus(String s) {
		status = s;
	}

	public String getStatus() {
		return status;
	}

}
