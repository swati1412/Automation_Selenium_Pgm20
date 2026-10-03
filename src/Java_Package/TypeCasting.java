package Java_Package;

public class TypeCasting {

	public static void main(String[] args) {

		// ============Narrowing/Manual Casting / Down Casting============= //
		// double to int conversion
		double b = 5.9;
		int a = (int) b;
		System.out.println(b); // 5.9
		System.out.println(a); // 5

		// ========================Widening/Auto Casting / Up Casting==============//
		// int to double
		int c = 5;
		double d = c; // Automatic Casting - int to double
		System.out.println(c); // 5
		System.out.println(d); // 5.0

		// ============Other Conversion================//
		// String to int conversion
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i); // 10

		// int to String conversion
		int z = 5;
		String t = String.valueOf(z);
		System.out.println(t.length()); // 1
		System.out.println(t); // 5

		// double to String
		String str = String.valueOf(d);
		System.out.println("String value: " + str);

	}

}
