package Java_Package;

public class Static5 {

	int x = 10; // Global Variable
	static int y = 5; // static variable

	// non static method
	public void a() {
		int z = 10; // Local Variable
		System.out.println(z); // 10
	}

	static int b = 6; // static variable

	// static method
	public static void b() {
		int a = 5; // Local Variable
		System.out.println(a); // 5
	}

	public static void main(String[] args) {
		Static5 s5 = new Static5();
		s5.a();
		System.out.println(Static4.z); // 5
		System.out.println(s5.b); // 6 - Not an appropriate way
		System.out.println(b); // 6 - Correct Way
		b(); // 5
		System.out.println(s5.x); // 10
		System.out.println(y); // 5
	}

}
