package Java_Package;

public class Variable9 {

	int b = 10; // Global Variable
	static int c = 5; // static variable

	// static method
	public static void d() {
		int e = 15; // Local Variable
		System.out.println(e); // 15
	}

	// Non static method
	public void f() {
		int g = 11; // Local Variable
		System.out.println(g); // 11
	}

	public static void main(String[] args) {
		int a = 6; // Local Variable
		System.out.println(a); // 6 - Calling variable

		// static member calling
		System.out.println(c); // 5 - calling static variable
		d(); // 15 - calling static method directly in the same class - predefined rule

		// Non Static Member Calling
		Variable9 v9 = new Variable9();
		System.out.println(v9.b); // 10 - calling non static variable
		v9.f(); // 11 - Calling non static method using class ref - Predefined rule

	}

}
