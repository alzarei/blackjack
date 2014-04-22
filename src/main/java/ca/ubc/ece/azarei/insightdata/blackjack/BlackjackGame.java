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

	private static final int numberOfUsers = 1;
	private static final int numberOfDecks = 3;
	private static UserInterface UI;
	private Table table;

	public static final int TWIENTY_ONE = 21;
	public static final int FACE_OR_TEN_RANK_VALUE = 10;
	public static final int ACE_OFFSET = 10;
	public static final int SOFT_HAND_LIMIT = 11;

	/**
	 * This constructor gets the user interface and builds the game. It asks for number of players
	 * and number of decks in the game. The number of decks significantly affects the chances of
	 * winning, i.e. the house advantage. The table is also initiated and added to the game here.
	 */
	public BlackjackGame(UserInterface userInteface) {
		setUi(userInteface);

		// numberOfUsers =
		// Integer.parseInt((String) UI.getInput("Please input the number of players..."));
		// numberOfDecks =
		// Integer.parseInt((String) UI.getInput("Please input the number of Decks..."));

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
		Rules.updateStatuses(table);
		blackjackRound.showResults();

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
