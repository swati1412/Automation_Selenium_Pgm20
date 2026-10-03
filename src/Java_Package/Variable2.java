package Java_Package;

public class Variable2 {

	public static void main(String[] args) {

		int a = 5; // Defining int type local variable
		System.out.println(a); // 5 - Calling 'a' variable

		int x = 100; // Defining int type local variable
		System.out.println(x); // 100

		x = 20;
		System.out.println(x); // 20

		x = 400;
		System.out.println(x); // 400

		char c = 'a'; // char type local variable, should be placed inside single quote
		System.out.println(c); // a

		boolean b = true;
		System.out.println(b); // true
		b = false;
		System.out.println(b); // false

		System.out.println(3 > 12); // false

		int e = 100; // int type local variable
		int f = 200; // int type local variable

		boolean z = e > f;
		System.out.println(z); // false
	}
}
