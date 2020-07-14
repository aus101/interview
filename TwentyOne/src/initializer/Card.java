package initializer;

public class Card { 
	
	private String suit;
	private int value;
	private boolean isAce;
	private String faceCard;
	
	public Card() {}
	
	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
		this.isAce = false;//is false by default but being explicit
	}
	
	public Card(String suit, int value, boolean isAce) {
		this.suit = suit;
		this.value = value;
		this.isAce = isAce;
	}
	
	public Card(String suit, int value, String faceCard, boolean isAce) {
		this.suit = suit;
		this.value = value;
		this.isAce = isAce;
	}
	
	public String getFaceCard() {
		return faceCard;
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isAce() {
		return isAce;
	}

	public void setAce(boolean isAce) {
		this.isAce = isAce;
	}
}
