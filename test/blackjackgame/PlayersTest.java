/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aziz
 */
public class PlayersTest {
	
	public PlayersTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of emptyHand method, of class Players.
	 */
	@Test
	public void testEmptyHand() {
		System.out.println("emptyHand");
		Players instance = null;
		instance.emptyHand();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addCardToPlayersHand method, of class Players.
	 */
	@Test
	public void testAddCardToPlayersHand() {
		System.out.println("addCardToPlayersHand");
		Cards card = null;
		Players instance = null;
		boolean expResult = false;
		boolean result = instance.addCardToPlayersHand(card);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getPlayersHandTotal method, of class Players.
	 */
	@Test
	public void testGetPlayersHandTotal() {
		System.out.println("getPlayersHandTotal");
		Players instance = null;
		int expResult = 0;
		int result = instance.getPlayersHandTotal();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of printCardsInHand method, of class Players.
	 */
	@Test
	public void testPrintCardsInHand() {
		System.out.println("printCardsInHand");
		boolean showFirstCard = false;
		Players instance = null;
		instance.printCardsInHand(showFirstCard);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of splitPossible method, of class Players.
	 */
	@Test
	public void testSplitPossible() {
		System.out.println("splitPossible");
		Players instance = null;
		boolean expResult = false;
		boolean result = instance.splitPossible();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
