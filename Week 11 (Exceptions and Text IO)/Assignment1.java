// Calculator program that has an exception handler for dealing with nonnumeric operands 

public class Assignment1 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		
		int result = 0;
		
		try {
			switch (args[1].charAt(0)) {
				case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
				case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
				case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
				case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
			}
		}
		
		catch (NumberFormatException ex){
			System.out.println("Wrong Input: " + ex.getMessage().replaceAll("[ Forinputstring:\"]", ""));
			System.exit(1);
		}
		
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
	}
}
