package Java_Package;

public class BreakStatement {

	public static void main(String[] args) {

		// Using for loop
		for (int i = 0; i < 5; i++) {
			// if statement
			if (i == 3) {
				break; // break loop
			}
			System.out.println(i);
		}

		System.out.println("=====Control came out from for loop======");

		// Using while loop
		int j = 1; // local variable
		while (j < 5) {
			if (j == 3) {
				break;
			}
			System.out.println(j);
			j++;
		}
		System.out.println("=======Control came out from while loop========");

	}

}
