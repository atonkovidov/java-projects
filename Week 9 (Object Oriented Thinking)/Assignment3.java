// A calculator that accepts operands separated by zero or more spaces

public class Assignment3 {

	public static void main(String[] args) {
		// Check number of strings passed
		if (args.length != 1) {
			System.out.println("Usage: java Calculator \"operand1 operator operand2\"");
			System.exit(1);
		}
		// The result of the operation
		int result = 0;
		// The result of the operation
		String s = insertBlanks(args[0]);
		// Determine the operator
		String[] elements = s.split("[\\s]");
		switch (elements[1]) {
		case "+": result = Integer.parseInt(elements[0]) + Integer.parseInt(elements[2]); break;
		case "-": result = Integer.parseInt(elements[0]) - Integer.parseInt(elements[2]); break;
		case "*": result = Integer.parseInt(elements[0]) * Integer.parseInt(elements[2]); break;
		case "/": result = Integer.parseInt(elements[0]) / Integer.parseInt(elements[2]); break;
		}
		// Display result
		for (String e: elements)
			System.out.print(e + " ");
		System.out.print("= " + result);
	}

	public static String insertBlanks(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
				result += " " + s.charAt(i) + " ";
			else if (String.valueOf(s.charAt(i)).matches("\\s"))
				continue;
			else
				result += s.charAt(i);
		}
		return result;
	}
}
