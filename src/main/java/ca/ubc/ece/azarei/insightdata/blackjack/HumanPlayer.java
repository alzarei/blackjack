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
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Gambler#play(ca.ubc.ece.azarei.insightdata.blackjack
	 *      .Table)
	 */
	@Override
	public boolean play(Table table) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * ca.ubc.ece.azarei.insightdata.blackjack.Gambler#hit(ca.ubc.ece.azarei.insightdata.blackjack
	 * .Table)
	 */
	@Override
	public boolean hit(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * ca.ubc.ece.azarei.insightdata.blackjack.Gambler#stand(ca.ubc.ece.azarei.insightdata.blackjack
	 * .Table)
	 */
	@Override
	public boolean stand(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * ca.ubc.ece.azarei.insightdata.blackjack.Player#split(ca.ubc.ece.azarei.insightdata.blackjack
	 * .Table)
	 */
	@Override
	public boolean split(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * ca.ubc.ece.azarei.insightdata.blackjack.Player#doubleDown(ca.ubc.ece.azarei.insightdata.blackjack
	 * .Table)
	 */
	@Override
	public boolean doubleDown(Table table) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * ca.ubc.ece.azarei.insightdata.blackjack.Player#bet(ca.ubc.ece.azarei.insightdata.blackjack
	 * .Table)
	 */
	@Override
	public Currency bet(Table table) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Gambler#act(ca.ubc.ece.azarei.insightdata.blackjack
	 *      .Table)
	 */
	@Override
	public boolean act(Table table) {

		String tableStatus = createTablePresentation(table);
		BlackjackGame.getUi().showOutput(tableStatus);

		return false;
	}

	/**
	 * @param table
	 * @return
	 */
	private String createTablePresentation(Table table) {
		// TODO Auto-generated method stub
		return null;
	}

}
