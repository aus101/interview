package initializer;

import executor.Initializer;


public class InitializerTest {

	/**
	 *  Setup
		Initialize.
		Create a deck of cards
		Create the players
	 */
	public static void main(String[] args) {
		deckTest();
		deckSizeTest();
		playerTest();
	}
	
	public static void deckTest() {
		Card card = new Card();
		Card isAce = new Card("heart", 11, true);
		
		System.out.println(card != null);
		System.out.println(isAce.isAce());
	}
	
	public static void deckSizeTest() {
		Initializer generator = new Initializer();
		System.out.println((generator.deckGenerator()));
	}
	
	public static void playerTest() {
		Initializer generator = new Initializer();
		generator.deckGenerator();
		System.out.println(("Austin".equals(generator.getPlayer().getName())));
	}

}
