/**
 * This abstract class models a general superclass for player and dealer in the Blackjack game.
 * Dealer's and Player's commonalities are abstracted into this class.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public abstract class Gambler {

	private GamblerStatus status;

	/**
     * 
     */
	public Gambler() {

		status = GamblerStatus.CAN_HIT;

	}

	/**
	 * @param table
	 * @return
	 */
	public boolean play(Table table) {

		setStatus(determineStatus());
		while (status == GamblerStatus.CAN_HIT) {
			this.act(table);
			setStatus(determineStatus());

		}

		return false;
	}

	/**
	 * @param gambler
	 * @return
	 */
	public abstract GamblerStatus determineStatus();

	public abstract boolean hit(Table table);

	public abstract boolean stand(Table table);

	public abstract boolean act(Table table);

	/**
	 * @return the status
	 */
	public GamblerStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(GamblerStatus status) {
		this.status = status;
	}

}
