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
public class GameMainTest {

	public GameMainTest() {
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
	 * Test of main method, of class GameMain.
	 */
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		GameMain.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of ifWin method, of class GameMain.
	 */
	@Test
	public void testIfWinGood() {
		System.out.println("ifWin");
		int playerHand = 21;
		int system = 15;
		GameMain instance = null;
		boolean expResult = true;
		boolean result = instance.ifWin(playerHand, system);
		System.out.println(result);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	@Test
	public void testIfWinBad() {
		System.out.println("ifWin");
		int playerHand = 10;
		int system = 15;
		GameMain instance = null;
		boolean expResult = false;
		boolean result = instance.ifWin(playerHand, system);
		System.out.println(result);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	@Test
	public void testIfWinBoundary() {
		System.out.println("ifWin");
		int playerHand = 21;
		int system = 20;
		GameMain instance = null;
		boolean expResult = true;
		boolean result = instance.ifWin(playerHand, system);
		System.out.println(result);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	@Test
	public void allowBetGood() {
		System.out.println("allowBet");
		int credit = 100;
		int bet = 25;
		GameMain instance = null;
		boolean expResult = true;
		boolean result = instance.allowBet(credit, bet);
		System.out.println(result);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	@Test
	public void allowBetBad() {
		System.out.println("allowBet");
		int credit = 100;
		int bet = 101;
		GameMain instance = null;
		boolean expResult = false;
		boolean result = instance.allowBet(credit, bet);
		System.out.println(result);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	@Test
	public void allowBetBoundary() {
		System.out.println("allowBet");
		int credit = 100;
		int bet = 100;
		GameMain instance = null;
		boolean expResult = true;
		boolean result = instance.allowBet(credit, bet);
		System.out.println(result);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	@Test
	public void splitPossibleGood() {
		System.out.println("Split possible");
		Cards cardOne = new Cards(Suits.valueOf("Clubs"), 10);
		Cards cardTwo = new Cards(Suits.valueOf("Clubs"), 10);
		GameMain instance = null;
		boolean expResult =true;
		boolean result = instance.ifSplit(cardOne,cardTwo);
		assertEquals(expResult, result);

	}
	@Test
	public void splitPossibleBad() {
		System.out.println("Split possible");
		Cards cardOne = new Cards(Suits.valueOf("Clubs"), 11);
		Cards cardTwo = new Cards(Suits.valueOf("Clubs"), 10);
		GameMain instance = null;
		boolean expResult =false;
		boolean result = instance.ifSplit(cardOne,cardTwo);
		assertEquals(expResult, result);

	}
	@Test
	public void splitPossibleBoundary() {
		System.out.println("Split possible");
		Cards cardOne = new Cards(Suits.valueOf("Clubs"), 10);
		Cards cardTwo = new Cards(Suits.valueOf("Hearts"), 10);
		GameMain instance = null;
		boolean expResult =true;
		boolean result = instance.ifSplit(cardOne,cardTwo);
		assertEquals(expResult, result);

	}

}
