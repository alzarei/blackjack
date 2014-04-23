/**
 * This class models a round of blackjack game. Each round stars with shuffling cards, betting,
 * dealing cards, playing in turn from the first player to the dealer.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import ca.ubc.ece.azarei.insightdata.blackjack.expetions.NegativeNumberOfDecksExeption;
import ca.ubc.ece.azarei.insightdata.blackjack.ui.TextUserInterface;

/**
 * @author Alexander Zarei
 */
public class Round {

	private Table table;

	/**
	 * @param table
	 * @throws NegativeNumberOfDecksExeption
	 */
	public Round(Table table) throws NegativeNumberOfDecksExeption {

		this.table = table;
		// at the beginning the Deckshoe is filled and shuffled!
		DeckShoe deckShoe = new DeckShoe(table.getDeckShoe().getNumberOfDecks());
		deckShoe.shuffle();
		table.setDeckShoe(deckShoe);

	}

	/**
	 * Betting in a round. Each player bets at the beginning of the game.
	 */
	public void Bet() {

		for (Player player : table.getPlayers()) {
			player.bet(table);
		}

	}

	/**
	 * All players play in turn
	 */
	public void play() {

		for (Player player : table.getPlayers()) {
			table.setTurn(player);
			player.play(table);

		}

		if (mustDealerPlay()) {

			// making all dealers cards faced up!
			for (Card c : ((DealerHand) (table.getDealer().getHand())).getFacedDownCards()) {
				table.getDealer().getHand().addCard(c);
			}
			((DealerHand) (table.getDealer().getHand())).getFacedDownCards().clear();

			BlackjackGame.getUi().showOutput(
			        TextUserInterface.HORIZENTAL_LINE + TextUserInterface.NEW_LINE +
			                "Dealer starts playing!" + TextUserInterface.NEW_LINE
			                + "Dealer's hand: "
			                + table.getDealer().getHand().getVisibleCards());
			table.setTurn(table.getDealer());
			table.getDealer().play(table);
		}
	}

	/**
	 * Checks if any player is in stand mode.
	 * 
	 * @return true if there is any player left at stand mode. Otherwise it returns false meaning
	 *         that the dealer does not need to play as all players are in Blackjack or Busted mode!
	 */
	public boolean mustDealerPlay() {

		for (Player player : table.getPlayers()) {
			if (player.getStatus() == GamblerStatus.STAND)
				return true;
		}
		return false;
	}

	/**
	 * The Dealers deals two cards to everyone including herself.
	 */
	public void Deal() {

		BlackjackGame.getUi().showOutput("The dealer is dealing!! Pay attention!!");

		for (Player player : table.getPlayers()) {
			// once
			Card card1 = table.getDeckShoe().getNextCard();
			player.getHand().addCard(card1);

			// twice
			Card card2 = table.getDeckShoe().getNextCard();
			player.getHand().addCard(card2);

		}

		Card card1 = table.getDeckShoe().getNextCard();
		((DealerHand) (table.getDealer().getHand())).addFacedDownCard(card1);

		Card card2 = table.getDeckShoe().getNextCard();
		table.getDealer().getHand().addCard(card2);

	}

	/**
	 * Shows the result for all players.
	 */
	public void showResults() {
		for (Player player : table.getPlayers()) {
			player.showResults(table);
		}

	}

}
