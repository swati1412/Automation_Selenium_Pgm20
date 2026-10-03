package Java_Package;

public class Operator_Unary {

	public static void main(String[] args) {

		int a = 5; // Local Variable
		int b = 5; // Local Variable

		System.out.println(a); // 5
		System.out.println(a++); // 5, 6
		System.out.println(a); // 6
		System.out.println(++a); // 7
		System.out.println(a); // 7
		System.out.println(a--); // 7, 6
		System.out.println(a--); // 6, 5
		System.out.println(a); // 5
		System.out.println(--a); // 4
		System.out.println(a++ + ++a); // 4, 5, 6, 6 = O/P - 10
		System.out.println(a + a++); // 6, 6, 7 = O/P - 12
		System.out.println(b++ + b--); // 5, 6, 6, 5 = 11 O/P
		System.out.println(b-- + ++b); // 5, 4, 5, 5 = 10 O/P
		System.out.println(b); // 5
		System.out.println(a++ + b++); // 7, 8, 5, 6 = 12 O/P

	}

}

