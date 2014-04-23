/**
 * 
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Alexander Zarei
 */
public class TestDeckShoe {

	private DeckShoe deckShoe;

	/**
	 * @param deckShoe
	 *            the deckShoe to set
	 */
	public void setDeckShoe(DeckShoe deckShoe) {
		this.deckShoe = deckShoe;
	}

	/**
	 * @return the deckShoe
	 */
	public DeckShoe getDeckShoe() {
		return deckShoe;
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

		setDeckShoe(new DeckShoe(3));

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ca.ubc.ece.azarei.insightdata.blackjack.DeckShoe#DeckShoe(int)}.
	 */
	@Test
	public void testDeckShoe() {

		int count = 0;
		while (getDeckShoe().getNextCard() != null) {
			count++;
		}

		assertTrue(count == 3 * 52);
	}

	/**
	 * Test method for {@link ca.ubc.ece.azarei.insightdata.blackjack.DeckShoe#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {

		assertFalse(getDeckShoe().isEmpty());
		while (getDeckShoe().getNextCard() != null) {

		}

		assertTrue(getDeckShoe().isEmpty());

	}

	/**
	 * Test method for {@link ca.ubc.ece.azarei.insightdata.blackjack.DeckShoe#shuffle()}.
	 */
	@Test
	public void testShuffle() {

		getDeckShoe().shuffle();

		int count = 0;
		while (getDeckShoe().getNextCard() != null) {
			count++;
		}

		assertTrue(count == 3 * 52);

	}

}
