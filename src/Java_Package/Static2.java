package Java_Package;

public class Static2 {

	static int roll; // Declaring static Variable
	static String name; // Declaring Static Variable
	String college = "IIT Bombay"; // Defining Global Variable
	int a = 10; // Defining Global Variable

	public static void main(String[] args) {

		Static2 s2 = new Static2();

		System.out.println(roll); // 0
		System.out.println(name); // null
		System.out.println(s2.college); // IIT Bombay
		System.out.println(s2.a); // 10
	}

}
