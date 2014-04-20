package ca.ubc.ece.azarei.insightdata;

import ca.ubc.ece.azarei.insightdata.blackjack.BlackjackGame;
import ca.ubc.ece.azarei.insightdata.blackjack.expetions.BlackjackException;
import ca.ubc.ece.azarei.insightdata.blackjack.ui.TextUserInterface;
import ca.ubc.ece.azarei.insightdata.blackjack.ui.UserInterface;

/**
 * Hello world!
 */
public class App
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		UserInterface ui = new TextUserInterface();

		BlackjackGame bjGame = new BlackjackGame();

		try {
			bjGame.start();
		} catch (BlackjackException e) {

			ui.showOutput(e.getMessage());

		} finally {

		}

	}
}
