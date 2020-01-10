// A program that automatically plays a game of craps for the user

public class Assignment2 {
	
	// Playing the game
	public static void main(String[] args) {
		int sum = rollDice();
		gameStatus(sum);
	}
	
	// Rolling Dice
	public static int rollDice() {
		int die1 = (int) (Math.random() * 6 + 1);
		int die2 = (int) (Math.random() * 6 + 1);
		int sum = die1 + die2;
		System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
		return sum;
	}
	
	// Checking win condition
	public static void gameStatus(int sum) {
		if (sum == 7 || sum == 11)
			System.out.println("You win");
		else if (sum == 2 || sum == 3 || sum == 12)
			System.out.println("You lose");
		else {
			System.out.println("point is " + sum);
			point(sum);
		}
	}
	
	// Continuing the game with an established point
	public static void point(int point) {
		int roll = rollDice();
		if (point == roll)
			System.out.println("You win");
		else if (roll == 7)
			System.out.print("You lose");
		else
			point(point);
	}
}

/* Output (4 test cases)

You rolled 2 + 5 = 7
You win

You rolled 4 + 1 = 5
point is 5
You rolled 1 + 1 = 2
You rolled 2 + 3 = 5
You win

You rolled 3 + 6 = 9
point is 9
You rolled 3 + 4 = 7
You lose

You rolled 6 + 6 = 12
You lose

*/