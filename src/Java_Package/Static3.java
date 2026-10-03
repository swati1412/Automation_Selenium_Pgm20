package Java_Package;

public class Static3 {
	
	String college = "IIT Bombay";
	static String s = "Shammi";

	public void getResult(int r, String n) {
		System.out.println(r + "  " + n + "  " + college);
		System.out.println(s);
	}

	public static void main(String[] args) {
		Static3 s3 = new Static3();
		s3.getResult(1, "John"); // 1 John IIT Bombay
		s3.getResult(2, "Peter"); // 2 Peter IIT Bombay
		s3.getResult(3, "Alex"); // 3 Alex IIT Bombay
		System.out.println(s);
	}
	
	// #. static method can call static member directly.
	// #. non static method can call non static member directly.
	// #. non static method can call static member directly
	// #. static method can not call non static member directly, we need to create object of that class.
}
