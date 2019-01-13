import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<String> cards = new ArrayList<String>();

	public void shuffle() {
		//shuffle the cards
		Collections.shuffle(cards);
	}
	
	public String draw() {
		String drawnCard = cards.get(cards.size() - 1);
		cards.remove(cards.size() - 1);
		return drawnCard;
	}
	
	public void listCards() {
		System.out.println(cards);
	}
	
	public void createDeck() {
		String suit;
		for(int x = 0; x < 4; x++) {
			switch (x) {
			case 0:
				suit = "Spades";
				break;
			case 1:
				suit = "Clubs";
				break;
			case 2:
				suit = "Hearts";
				break;
			case 3:
				suit = "Diamonds";
				break;
			default:
				suit = "NA";
			}
			for (int y = 1; y < 14; y++) {
				if (y == 1) {
					cards.add("Ace of " + suit);
				}
				else if (y == 11) {
					cards.add("Jack of " + suit);
				}
				else if (y == 12) {
					cards.add("Queen of " + suit);
				}
				else if (y == 13) {
					cards.add("King of " + suit);
				}
				else {
					cards.add(y + " of " + suit);
				}
			}
		}
		// System.out.println(cards);
	}
}
