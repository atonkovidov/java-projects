// Calculator program that deals with nonnumeric operands without exception handling 

import java.util.Scanner;

public class Assignment1_noExceptionHandling {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		
		// Checking if inputs are integers 
		Scanner checker1 = new Scanner(args[0]);
		Scanner checker2 = new Scanner(args[2]);
		
		if (checker1.hasNextInt() == false) {
			System.out.println("Wrong Input: " + args[0]);
			System.exit(1);
		}
		else if (checker2.hasNextInt() == false) {
			System.out.println("Wrong Input: " + args[2]);
			System.exit(1);
		}
		
		int result = 0;
		
//		try {
			switch (args[1].charAt(0)) {
				case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
				case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
				case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
				case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
			}
//		}
		
//		catch (NumberFormatException ex){
//			System.out.println("Wrong Input: " + ex.getMessage().replaceAll("[ Forinputstring:\"]", ""));
//			System.exit(0);
//		}
		
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
	}
}
