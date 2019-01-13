import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tieCount = 0;
		Card card = new Card();
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck.createDeck();
		deck.shuffle();
		// deck.listCards();
		for (int i = 2; i < 54; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
		// deck.listCards();
		// player1.printHand();
		// player2.printHand();
		
		// System.out.println(card.getCardValue(player1.flip()));
		
		for(int x = 0; x < 26; x++) {
			int card1 = card.getCardValue(player1.flip());
			int card2 = card.getCardValue(player2.flip());
			if (card1 > card2) {
				player1.incrementScore();
			}
			else if (card2 > card1) {
				player2.incrementScore();
			}
			else if (card1 == card2) {
				tieCount++;
			}
		}
		System.out.println("Player One's Score is: " + player1.returnScore());
		System.out.println("Player Two's Score is: " + player2.returnScore());
		System.out.println("Both Players Tied " + tieCount + " Time(s)");
		
		if (player1.returnScore() > player2.returnScore()) {
			System.out.println("Player One");
		}
		else if (player1.returnScore() < player2.returnScore()){
			System.out.println("Player Two");
		}
		else if (player1.returnScore() == player2.returnScore()) {
			System.out.println("Draw");
		}

	}
}
