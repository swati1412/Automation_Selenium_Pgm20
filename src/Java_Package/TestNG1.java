package Java_Package;

import org.testng.annotations.Test;

public class TestNG1 {

	public static void main(String[] args) {
		System.out.println("hello main method");
	}

	@Test
	public void testMethod() {
		System.out.println("Hello Test Method");
		int a = 5;
		System.out.println(a);// 5
	}

}

