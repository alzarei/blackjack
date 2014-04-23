/**
 * This Exception is thrown when The deck goes out of card. This generally happens when we have many players and only one Deck of card!
 */
package ca.ubc.ece.azarei.insightdata.blackjack.expetions;

/**
 * @author Alexander Zarei
 *
 */
public class OutOfCardException extends BlackjackException {

	/**
	 * @param message
	 */
	public OutOfCardException(String message) {
		super(message);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8572752494647426620L;

}
