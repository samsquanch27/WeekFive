public class Card {
	int value;
	String name;

	public int getCardValue(String cardName) {
		switch (cardName) {
		case "Ace of Spades":
			return 2;
		case "2 of Spades":
			return 3;

		case "3 of Spades":
			return 4;

		case "4 of Spades":
			return 5;

		case "5 of Spades":
			return 6;

		case "6 of Spades":
			return 7;

		case "7 of Spades":
			return 8;

		case "8 of Spades":
			return 9;

		case "9 of Spades":
			return 10;

		case "10 of Spades":
			return 11;

		case "Jack of Spades":
			return 12;

		case "Queen of Spades":
			return 13;

		case "King of Spades":
			return 14;

		case "Ace of Clubs":
			return 2;

		case "2 of Clubs":
			return 3;

		case "3 of Clubs":
			return 4;

		case "4 of Clubs":
			return 5;

		case "5 of Clubs":
			return 6;

		case "6 of Clubs":
			return 7;

		case "7 of Clubs":
			return 8;

		case "8 of Clubs":
			return 9;

		case "9 of Clubs":
			return 10;

		case "10 of Clubs":
			return 11;

		case "Jack of Clubs":
			return 12;

		case "Queen of Clubs":
			return 13;

		case "King of Clubs":
			return 14;

		case "Ace of Hearts":
			return 2;

		case "2 of Hearts":
			return 3;

		case "3 of Hearts":
			return 4;

		case "4 of Hearts":
			return 5;

		case "5 of Hearts":
			return 6;

		case "6 of Hearts":
			return 7;

		case "7 of Hearts":
			return 8;

		case "8 of Hearts":
			return 9;

		case "9 of Hearts":
			return 10;

		case "10 of Hearts":
			return 11;

		case "Jack of Hearts":
			return 12;

		case "Queen of Hearts":
			return 13;

		case "King of Hearts":
			return 14;

		case "Ace of Diamonds":
			return 2;

		case "2 of Diamonds":
			return 3;

		case "3 of Diamonds":
			return 4;

		case "4 of Diamonds":
			return 5;

		case "5 of Diamonds":
			return 6;

		case "6 of Diamonds":
			return 7;

		case "7 of Diamonds":
			return 8;

		case "8 of Diamonds":
			return 9;

		case "9 of Diamonds":
			return 10;

		case "10 of Diamonds":
			return 11;

		case "Jack of Diamonds":
			return 12;

		case "Queen of Diamonds":
			return 13;

		case "King of Diamonds":
			return 14;
		default:
			return 0;
		}
	}

	public int describe(String cardName) {

		return value;
	}
}
