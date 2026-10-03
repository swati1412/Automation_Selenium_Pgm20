package Java_Package;

public class Array1 {

	public static void main(String[] args) {

		// Declare an array
		int a[] = new int[5];

		// Print the length of an array
		System.out.println(a.length); // 5

		// Print the default value of an array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Assign value to an array
		a[0] = 65;
		a[1] = 99;
		a[2] = 5;
		a[3] = 10;
		a[4] = 6;

		System.out.println(a[3]); // 10

		// Print all array elements
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

}
