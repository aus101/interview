package executor;


import initializer.Card;
import initializer.Player;

import java.util.ArrayList;
import java.util.List;

public class Initializer {
	
	Player player;

	public static final int DECK_SIZE = 52;
	public static final int SUITS = 4;
	

	
	public int deckGenerator() {
		player = new Player("Austin");
		
		List<Card> deckOfCards = new ArrayList<Card>(52);
	
			
		for (int j=2; j<=10; j++) {
			deckOfCards.add(new Card("Heart", j));
		}
			//public Card(String suit, int value, String faceCard, boolean isAce) {
			deckOfCards.add(new Card("Heart", 10, "Jack", false));
			deckOfCards.add(new Card("Heart", 10, "Queen", false));
			deckOfCards.add(new Card("Heart", 10, "King", false));
			deckOfCards.add(new Card("Heart", 11, true));	
		
		
		for (int j=2; j<=10; j++) {
			deckOfCards.add(new Card("Spade", j));
		}
		//public Card(String suit, int value, String faceCard, boolean isAce) {
		deckOfCards.add(new Card("Spade", 10, "Jack", false));
		deckOfCards.add(new Card("Spade", 10, "Queen", false));
		deckOfCards.add(new Card("Spade", 10, "King", false));
		deckOfCards.add(new Card("Spade", 11, true));	
		
	
		for (int j=2; j<=10; j++) {
			deckOfCards.add(new Card("Club", j));
		}
			//public Card(String suit, int value, String faceCard, boolean isAce) {
			deckOfCards.add(new Card("Club", 10, "Jack", false));
			deckOfCards.add(new Card("Club", 10, "Queen", false));
			deckOfCards.add(new Card("Club", 10, "King", false));
			deckOfCards.add(new Card("Club", 11, true));	
		
			
			for (int j=2; j<=10; j++) {
				deckOfCards.add(new Card("Heart", j));
			}
			//public Card(String suit, int value, String faceCard, boolean isAce) {
			deckOfCards.add(new Card("Diamond", 10, "Jack", false));
			deckOfCards.add(new Card("Diamond", 10, "Queen", false));
			deckOfCards.add(new Card("Diamond", 10, "King", false));
			deckOfCards.add(new Card("Diamond", 11, true));	

			
			return deckOfCards.size();
		}
	
	public Player getPlayer() {
		return player;
	}
	
		

}
