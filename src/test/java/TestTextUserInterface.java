import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.ubc.ece.azarei.insightdata.blackjack.ui.TextUserInterface;

/**
 * 
 */

/**
 * @author Alexander Zarei
 */
public class TestTextUserInterface {

	private InputStream stIn;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		stIn = System.in;

	}

	@After
	public void tearDown() {
		System.setIn(stIn);
	}

	/**
	 * Test method for
	 * {@link ca.ubc.ece.azarei.insightdata.blackjack.ui.TextUserInterface#getInput()}.
	 */
	@Test
	public void testGetInput() {
		String data = "Users Input";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		TextUserInterface ui = new TextUserInterface();
		String input = (String) ui.getInput();
		assertTrue(input.equals(data));

	}

	/**
	 * Test method for
	 * {@link ca.ubc.ece.azarei.insightdata.blackjack.ui.TextUserInterface#showOutput(java.lang.Object)}
	 * .
	 */
	@Test
	public void testShowOutput() {

	}

	/**
	 * Test method for
	 * {@link ca.ubc.ece.azarei.insightdata.blackjack.ui.TextUserInterface#getInput(java.lang.Object)}
	 * .
	 */
	@Test
	public void testGetInputObject() {

	}

}
