/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Alexander Zarei
 */
public class TestCard {

	private Card card;

	private Card createCard() {
		Card card = new Card(CardSuit.HEARTS, CardRank.KING);
		return card;
	}

	/**
	 * @param card
	 *            the card to set
	 */
	public void setCard(Card card) {
		this.card = card;
	}

	/**
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		setCard(createCard());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link ca.ubc.ece.azarei.insightdata.blackjack.Card#Card(ca.ubc.ece.azarei.insightdata.blackjack.CardSuit, ca.ubc.ece.azarei.insightdata.blackjack.CardRank)}
	 * .
	 */
	@Test
	public void testCard() {

	}

	/**
	 * Test method for {@link ca.ubc.ece.azarei.insightdata.blackjack.Card#getRank()}.
	 */
	@Test
	public void testGetRank() {

		assertTrue(getCard().getRank() == CardRank.KING);

	}

	/**
	 * Test method for {@link ca.ubc.ece.azarei.insightdata.blackjack.Card#getSuit()}.
	 */
	@Test
	public void testGetSuit() {
		assertTrue(getCard().getSuit() == CardSuit.HEARTS);
	}

	/**
	 * Test method for {@link ca.ubc.ece.azarei.insightdata.blackjack.Card#toString()}.
	 */
	@Test
	public void testToString() {

		assertTrue(getCard().toString().equals("Hearts   King     "));

	}

}
