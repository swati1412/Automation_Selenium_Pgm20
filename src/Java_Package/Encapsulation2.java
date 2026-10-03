package Java_Package;

public class Encapsulation2 extends Encapsulation1 {

	// final method can not be override
	/*
	 * public void d() {
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Encapsulation2 e2 = new Encapsulation2();
		e2.setData("Selenium");
		System.out.println(e2.getData()); // Selenium
		e2.setData(5);
		System.out.println(e2.getData()); // 5
	}
}
