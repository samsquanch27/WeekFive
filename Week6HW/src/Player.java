import java.util.ArrayList;
import java.util.List;

public class Player{
	List<String> hand = new ArrayList<String>();
	int score = 0;
	String name;
	
	public static String describe(String desc) {
		return desc;
	}
	public String flip(){
		//removes and returns the top card
		String card = hand.get(hand.size()-1);
		hand.remove(hand.size() - 1);
		return card;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw().toString());
		
	}
	public void incrementScore() {
		score++;
	}
	
	public int returnScore() {
		return score;
	}
	
	public void printHand() {
		System.out.println(hand);
	}
}
