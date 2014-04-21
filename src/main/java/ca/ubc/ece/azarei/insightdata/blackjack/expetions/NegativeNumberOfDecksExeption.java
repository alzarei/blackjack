/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack.expetions;

/**
 * @author Alexander Zarei
 */
public class NegativeNumberOfDecksExeption extends BlackjackException {

	public NegativeNumberOfDecksExeption(String message) {
		super(message);
	}

	public String getMessage()
	{
		return super.getMessage();
	}

	/**
	 * @param message
	 * @param throwable
	 */
	public NegativeNumberOfDecksExeption(String message, Throwable throwable) {
		super(message, throwable);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2029460564877421849L;

}
