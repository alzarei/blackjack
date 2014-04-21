/**
 * This class models a casino table on which a blackjack game is played. The table encompass visible
 * information each player can see in a real game. This class is aimed to include the information a
 * player needs to decide what action to play when it is her turn.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.ArrayList;

import ca.ubc.ece.azarei.insightdata.blackjack.expetions.NegativeNumberOfDecksExeption;

/**
 * @author Alexander Zarei
 */
public class Table {

	private ArrayList<Player> players;
	private Dealer dealer;
	private Gambler turn;
	private DeckShoe deckShoe;

	/**
	 * The Dealer, the deckshoe and players are set up here.
	 * 
	 * @param numberOfPlayers
	 * @param numberOfDecks
	 * @throws NegativeNumberOfDecksExeption
	 */
	public Table(int numberOfPlayers, int numberOfDecks) throws NegativeNumberOfDecksExeption {

		dealer = new Dealer();
		for (int i = 0; i < numberOfPlayers; i++) {

			Player player = new HumanPlayer();
			players.add(player);
		}

		deckShoe = new DeckShoe();
		deckShoe.setNumberOfDecks(numberOfDecks);

	}

	/**
	 * @return the dealer
	 */
	public Dealer getDealer() {
		return dealer;
	}

	/**
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/**
	 * @return the deckShoe
	 */
	public DeckShoe getDeckShoe() {
		return deckShoe;
	}

	/**
	 * @return the turn
	 */
	public Gambler getTurn() {
		return turn;
	}

	/**
	 * @param dealer
	 *            the dealer to set
	 */
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	/**
	 * @param deckShoe
	 *            the deckShoe to set
	 */
	public void setDeckShoe(DeckShoe deckShoe) {
		this.deckShoe = deckShoe;
	}

	/**
	 * @param players
	 *            the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	/**
	 * @param turn
	 *            the turn to set
	 */
	public void setTurn(Gambler gambler) {
		this.turn = gambler;
	}
}
