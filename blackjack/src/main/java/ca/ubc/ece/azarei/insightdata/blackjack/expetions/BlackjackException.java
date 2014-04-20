/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack.expetions;

/**
 * @author Alexander Zarei
 *
 */
public abstract class BlackjackException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4200956847227120830L;
	
	public BlackjackException(String message) {
        super(message);
    }

    public BlackjackException(String message, Throwable throwable) {
        super(message, throwable);
    }
    
    public String getMessage()
    {
        return super.getMessage();
    }


}
