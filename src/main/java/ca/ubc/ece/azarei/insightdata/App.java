package ca.ubc.ece.azarei.insightdata;

import ca.ubc.ece.azarei.insightdata.blackjack.BlackjackGame;
import ca.ubc.ece.azarei.insightdata.blackjack.expetions.BlackjackException;
import ca.ubc.ece.azarei.insightdata.blackjack.ui.TextUserInterface;
import ca.ubc.ece.azarei.insightdata.blackjack.ui.UserInterface;

/**
 * This class is the start point of the application. The program starts execution from the main
 * method in this class.
 */
public class App
{

	/**
	 * The starting point of execution.
	 * 
	 * @param args
	 *            These are the command line arguments.
	 */
	public static void main(String[] args)
	{

		UserInterface ui = new TextUserInterface();

		BlackjackGame bjGame = new BlackjackGame(ui);

		try {
			bjGame.play();
		} catch (BlackjackException e) {

			ui.showOutput(e.getMessage());

		} finally {

		}

	}
}
