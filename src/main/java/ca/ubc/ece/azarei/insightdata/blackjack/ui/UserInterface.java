/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack.ui;

/**
 * @author Alexander Zarei
 */
public abstract class UserInterface {

	public abstract Object getInput();

	public abstract void showOutput(Object output);

	public abstract Object getinput(Object message);

}
