package Java_Package;

public class Static4 {

	static int z = 5; // static variable
	int y = 1; // Global Variable

	// static method
	public static void a() {
		z = 10; // Modification of static variable value
		System.out.println(z);
	}

	// Non static method
	public void b() {
		z = 15;
		System.out.println(z); // 15
	}

	public static void main(String[] args) {
		System.out.println(z);
		a();

		Static4 s4 = new Static4();
		s4.b(); // 15
	}

}
