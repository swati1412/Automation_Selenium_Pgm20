package Java_Package;

public class Operator_Logical {

	public static void main(String[] args) {

		int a = 10; // Local Variable
		int b = 5; // Local Variable
		int c = 20; // Local Variable

		// Logical Operator - If 1st condition is false, 2nd condition will not check
		System.out.println(a < b && a++ < c); // false
		System.out.println(a); // 10

	}

}
