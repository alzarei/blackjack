/**
 * This class models a Blackjack player.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.Currency;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import ca.ubc.ece.azarei.insightdata.blackjack.ui.TextUserInterface;

/**
 * @author Alexander Zarei
 */
public abstract class Player extends Gambler {

	private static AtomicInteger idGenerator = new AtomicInteger(0);
	private int id;
	private Currency bet;

	private static final int PLAYER_AUTO_STANT_LIMIT = 21;

	/**
     * 
     */
	public Player() {

		setHand(new Hand());
		setId(idGenerator.getAndIncrement());

	}

	public abstract boolean split(Table table);

	public abstract boolean doubleDown(Table table);

	public abstract Currency bet(Table table);

	/**
	 * @return
	 */

	@Override
	public int getAutoStandLimit() {

		return PLAYER_AUTO_STANT_LIMIT;
	}

	/**
	 * Shows the game result for an individual player
	 * 
	 * @param table
	 */
	public void showResults(Table table) {

		String result = createResultMessage();

		BlackjackGame.getUi().showOutput(result);

	}

	/**
	 * Prepares the result message
	 * 
	 * @return
	 */
	private String createResultMessage() {

		StringBuffer message = new StringBuffer();

		message.append(TextUserInterface.HORIZENTAL_LINE).
		        append(TextUserInterface.NEW_LINE).
		        append(TextUserInterface.HORIZENTAL_LINE).
		        append(TextUserInterface.NEW_LINE).
		        append("You ");

		switch (this.getStatus()) {
			case BLACKJACK:
				message.append("won by a Blackjack!!");
				break;
			case BUSTED:
				message.append("busted! Easy dude/gal!");
				break;
			case CAN_HIT:
				message.append(" still can hit! hmm!");
				break;
			case LOST:
				message.append(" lost! Nice try but gotta practice more! Or somehow ask universe for a better luck!");
				break;
			case STAND:
				message.append(" just stood! Maybe it was a wise decision! Let's see!");
				break;
			case PUSH:
				message.append(" reached a push! Neither lost nor won! Not too bad!");
				break;
			case WON:
				message.append(" won and that's great!");
				break;

			default:
				message.append(" have undefined status!! what brought you here?");
				break;
		}
		return message.toString();
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Gambler#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).
		        append("ID", id).
		        append("Bet", bet).
		        appendSuper(super.toString()).
		        toString();
	}

}
