/**
 * This class models the cards held in a blackjack {@link Dealer.java}'s hand. A dealer's hand
 * starts with two cards one of which face up and the other face down. All the cards in a dealers
 * hand go face up when it is the dealer's turn to play as the last player.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.ArrayList;

/**
 * @author Alexander Zarei
 */
public class DealerHand extends Hand {

	private ArrayList<Card> facedDownCards;

	/**
	 * @return the facedDownCards
	 */
	public ArrayList<Card> getFacedDownCards() {
		return facedDownCards;
	}

	/**
	 * @param facedDownCards
	 *            the facedDownCards to set
	 */
	public void setFacedDownCards(ArrayList<Card> facedDownCards) {
		this.facedDownCards = facedDownCards;
	}

	public void addFacedDownCard(Card card) {
		facedDownCards.add(card);
	}

}
