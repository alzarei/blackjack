/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Alexander Zarei
 */
public class TextUserInterface extends UserInterface {

	public static final String HORIZENTAL_LINE =
	        "______________________________________________________________________________";
	public static final String NEW_LINE = "\n";

	/*
	 * (non-Javadoc)
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.ui.UserInterface#getInput()
	 */
	@Override
	public Object getInput() {

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();

			return input;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.print(e.getMessage());
			return null;

		}
	}

	/*
	 * (non-Javadoc)
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.ui.UserInterface#showOutput(java.lang.Object)
	 */
	@Override
	public void showOutput(Object output) {

		System.out.println((String) output);

	}

	/*
	 * (non-Javadoc)
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.ui.UserInterface#getinput(java.lang.Object)
	 */
	@Override
	public Object getInput(Object output) {

		showOutput(output);
		return getInput();
	}

}
