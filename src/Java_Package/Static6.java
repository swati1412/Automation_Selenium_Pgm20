package Java_Package;

public class Static6 {

	String a; // Global Variable
	int b; // Global Variable
	static int c = 4; // static variable

	// static method
	public static void a() {
		System.out.println("Hello Static");
	}

	public static void main(String[] args) {
		Static6 s6 = new Static6();
		s6.a = "Java";
		s6.b = 1;
		c = 5;
		System.out.println(s6.a); // Java
		System.out.println(s6.b); // 1
		System.out.println(c); // 5
		a(); // Hello Static
	}
}
