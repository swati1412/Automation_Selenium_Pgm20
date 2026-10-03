package Java_Package;

public class ConditionalStatement {

	public static void main(String[] args) {

		// if statement
		int a = 15; // Local Variable
		if (a > 10) {
			System.out.println("a is greater than 10");
		}

		// if else statement
		int b = 20; // Local Variable
		if (b / 2 == 0) {
			System.out.println("Result of b is equal to zero");
		} else {
			System.out.println("Result of b is not equal to zero");
		}

		// if else if ladder statement
		int q = 300; // Local Variable
		int w = 300; // Local Variable
		if (q < w) {
			System.out.println("q is lesser than w");
		} else if (q == w) {
			System.out.println("q is equal to w");
		} else {
			System.out.println("q is greater");
		}

		// Nested if statement
		int age = 25; // Local Variable
		int weight = 55; // Local Variable

		// Outer if statement
		if (age > 18) {

			// Inner if statement
			if (weight > 50) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible");
			}
		} else {
			System.out.println("Age is not greater than 18");
		}
	}
}
