/**
 * This class models a round of blackjack game. Each round stars with shuffling cards, betting,
 * dealing cards, playing in turn from the first player to the dealer.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import ca.ubc.ece.azarei.insightdata.blackjack.expetions.NegativeNumberOfDecksExeption;

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

		// at the beginning the Deckshoe is filled and shuffled!
		DeckShoe deckShoe = new DeckShoe(table.getDeckShoe().getNumberOfDecks());
		deckShoe.shuffle();
		table.setDeckShoe(deckShoe);

	}

	/**
	 * 
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

		table.setTurn(table.getDealer());
		table.getDealer().play(table);

	}

	/**
	 * 
	 */
	public void Deal() {

		for (Player player : table.getPlayers()) {
			// once
			Card card1 = table.getDeckShoe().getNextCard();
			player.getHand().addCard(card1);

			// twice
			Card card2 = table.getDeckShoe().getNextCard();
			player.getHand().addCard(card2);

		}

		Card card1 = table.getDeckShoe().getNextCard();
		table.getDealer().getHand().addFacedDownCard(card1);

		Card card2 = table.getDeckShoe().getNextCard();
		table.getDealer().getHand().addCard(card2);

	}

}
