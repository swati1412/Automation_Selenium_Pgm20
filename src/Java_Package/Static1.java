package Java_Package;

public class Static1 {

	int x = 500; // Global Variable
	String s = "Hello"; // Global Variable
	static int y = 100; // static Variable

	// Static Method
	public static void method1() {
		String x = "Hi"; // Local Variable
		System.out.println(x); // Hi - Calling x Variable
	}

	// Non Static Method
	public void method2() {
		int i = 100; // Local Variable
	}
}
