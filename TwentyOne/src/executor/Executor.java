package executor;

import initializer.Player;

public class Executor {
	
	private static Player player = new Player("Austin");
	
	
	public static void main(String[] args) {
		Initializer init = new Initializer();
		init.deckGenerator();
	
	}
}
