// Program simulates picking a random card from a deck of 52 cards 

public class Assignment3 {

	public static void main(String[] args) {
		// Generate two random numbers for rank and suit
		int rank = (int)(Math.random() * 13);
		int suit = (int)(Math.random() * 4);
		
		// Selecting and outputting the random card
		System.out.print("The card you picked is ");
		
		// Rank
		switch (rank) {
		case 0: System.out.print("Ace of "); break;
		case 1: System.out.print("2 of "); break;
		case 2: System.out.print("3 of "); break;
		case 3: System.out.print("4 of "); break;
		case 4: System.out.print("5 of "); break;
		case 5: System.out.print("6 of "); break;
		case 6: System.out.print("7 of "); break;
		case 7: System.out.print("8 of "); break;
		case 8: System.out.print("9 of "); break;
		case 9: System.out.print("10 of "); break;
		case 10: System.out.print("Jack of "); break;
		case 11: System.out.print("Queen of "); break;
		case 12: System.out.print("King of "); break;
		}
		
		// Suit
		switch (suit) {
		case 0: System.out.println("Clubs"); break;
		case 1: System.out.println("Diamonds"); break;
		case 2: System.out.println("Hearts"); break;
		case 3: System.out.println("Spades"); break;
		}
	}
}


/* Output (three runs)

The card you picked is Ace of Diamonds

The card you picked is Queen of Hearts

The card you picked is 7 of Spades

*/
