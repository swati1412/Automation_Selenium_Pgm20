package Java_Package;

import java.util.Scanner;

public class ExceptionHandling6 {

	public static void a(int age) throws Exception {

		if (age < 18) {
			throw new ExceptionHandling5CustomExeception("Age is less than 18 - Not Eligible");
		} else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int b = sc.nextInt();
		a(b);
		System.out.println("Hello Custom Exception");
	}

}
