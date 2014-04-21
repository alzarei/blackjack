/**
 * This class embeds the game flow of playing a blackjack game.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import ca.ubc.ece.azarei.insightdata.blackjack.expetions.BlackjackException;
import ca.ubc.ece.azarei.insightdata.blackjack.expetions.NegativeNumberOfDecksExeption;
import ca.ubc.ece.azarei.insightdata.blackjack.ui.UserInterface;

/**
 * @author Alexander Zarei
 */
public class BlackjackGame {

	private static UserInterface UI;
	private Table table;

	/**
	 * This constructor gets the user interface and builds the game. It asks for number of players
	 * and number of decks in the game. The number of decks significantly affects the chances of
	 * winning, i.e. the house advantage. The table is also initiated and added to the game here.
	 */
	public BlackjackGame(UserInterface userInteface) {
		setUi(userInteface);

		int numberOfUsers = (Integer) UI.getinput("Please input the number of players...");
		int numberOfDecks = (Integer) UI.getinput("Please input the number of Decks...");

		try {
			table = new Table(numberOfUsers, numberOfDecks);
		} catch (NegativeNumberOfDecksExeption e) {
			UI.showOutput(e.getMessage());
			System.exit(1);
		}

	}

	public boolean play() throws BlackjackException {

		Round blackjackRound = new Round(getTable());
		blackjackRound.Bet();
		blackjackRound.Deal();
		blackjackRound.play();

		return true;
	}

	/**
	 * @return the table
	 */
	public Table getTable() {
		return table;
	}

	/**
	 * @param table
	 *            the table to set
	 */
	public void setTable(Table table) {
		this.table = table;
	}

	/**
	 * @param UI
	 *            the ui to set
	 */
	public static void setUi(UserInterface userInterface) {
		UI = userInterface;
	}

	/**
	 * @return the ui
	 */
	public static UserInterface getUi() {
		return UI;
	}

}
