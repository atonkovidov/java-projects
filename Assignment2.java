// Uses a formula to compute a basic approximation of pi

public class Assignment2 {

	public static void main(String[] args) {
		double x1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
		double x2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
		System.out.println(x1);
		System.out.println(x2);
	}
}


/* Output

2.9760461760461765
3.2837384837384844

*/