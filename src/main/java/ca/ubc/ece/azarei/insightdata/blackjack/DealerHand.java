/**
 * This class models the cards held in a blackjack {@link Dealer.java}'s hand. A dealer's hand
 * starts with two cards one of which face up and the other face down. All the cards in a dealers
 * hand go face up when it is the dealer's turn to play as the last player.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import java.util.ArrayList;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author Alexander Zarei
 */
public class DealerHand extends Hand {

	/**
	 * Dealer hides his first card. This is designed as an array so it could be extended in future
	 * versions. We will introduce a new version of Blackjack in which the dealer hides multiple
	 * cards!!
	 */
	private ArrayList<Card> facedDownCards;

	/**
	 * the constructor
	 */
	public DealerHand() {

		facedDownCards = new ArrayList<Card>();
	}

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

	/**
	 * @param card
	 */
	public void addFacedDownCard(Card card) {
		facedDownCards.add(card);
	}

	/**
	 * (
	 * 
	 * @see ca.ubc.ece.azarei.insightdata.blackjack.Hand#getAllCards()
	 */
	@Override
	public ArrayList<Card> getAllCards() {

		ArrayList<Card> allCards = new ArrayList<Card>();
		allCards.addAll(this.getVisibleCards());
		allCards.addAll(this.getFacedDownCards());

		return allCards;
	}

	/**
	 * Tailored string representation
	 */
	@Override
	public String toString() {

		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).
		        appendSuper(super.toString()).
		        append("Number of faced down cards", facedDownCards.size()).
		        toString();

	}
}
