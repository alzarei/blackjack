/**
 * This class models a human player. It provides interface for a human to play whenever it is her
 * turn.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.Currency;

/**
 * @author Alexander Zarei
 */
public class HumanPlayer extends Player {

	/**
	 * This method is not implemented because the minimal version of the software is not required to
	 * support this.
	 * 
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Player#split(ca.ubc.ece.azarei.insightdata.blackjack
	 *      .Table)
	 */
	@Override
	public boolean split(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This method is not implemented because the minimal version of the software is not requireded
	 * to support this. (non-Javadoc)
	 * 
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Player#doubleDown(ca.ubc.ece.azarei.insightdata.blackjack
	 *      .Table)
	 */
	@Override
	public boolean doubleDown(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This method is not implemented because the minimal version of the software is not requireded
	 * to support this. (non-Javadoc)
	 * 
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Player#bet(ca.ubc.ece.azarei.insightdata.blackjack
	 *      .Table)
	 */
	@Override
	public Currency bet(Table table) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This method carries out the acts (hit or stand) that a human player chooses to do.
	 * 
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Gambler#act(ca.ubc.ece.azarei.insightdata.blackjack
	 *      .Table)
	 */
	@Override
	public void act(Table table) {
		StringBuffer message = new StringBuffer();
		message.append(table.tableRepresentation());
		message.append("\n\nWhat would you like to do? Please input \"h\" for Hit or \"s\" for Stand...");

		// get input from user
		String input;
		do {
			input = (String) BlackjackGame.getUi().getInput(message.toString());
		} while ((!input.startsWith("S")) && (!input.startsWith("s"))
		        && (!input.startsWith("H")) && (!input.startsWith("h")));

		if (input.startsWith("H") || input.startsWith("h")) {
			try {
				BlackjackGame.getUi().showOutput("You hit!");
				this.hit(table);
			} catch (Exception e) {

				System.err.println(e.getMessage());
				System.exit(1);

			}

		} else {
			this.stand(table);
			BlackjackGame.getUi().showOutput("You stood!");
		}

	}

}
