package Java_Package;

public class Variable5 {

	public static void main(String[] args) {

		int a1 = 1;
		System.out.println(a1);

		int a2 = 2;
		System.out.println(a2);

		int a3 = 3;
		System.out.println(a3);

		int a[] = { 1, 2, 3 }; // int type array
		System.out.println(a[0]); // 1
		System.out.println(a[2]); // 3
		System.out.println(a[1]); // 2

		String b[] = { "John", "Peter" }; // String type array
		System.out.println(b[0]); // John
		System.out.println(b[1]); // Peter

		Object c[] = { 1, 2, 3, "John", "Peter", 'a', 'b', 3 > 12, 10.5 };
		System.out.println(c[0]); // 1
		System.out.println(c[1]); // 2
		System.out.println(c[2]); // 3
		System.out.println(c[4]); // Peter
		System.out.println(c[3]); // John
		System.out.println(c[5]); // a
		System.out.println(c[6]); // b
		System.out.println(c[7]); // false
		System.out.println(c[8]); // 10.5

	}

}

