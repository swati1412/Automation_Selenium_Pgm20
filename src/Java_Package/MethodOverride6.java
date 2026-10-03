package Java_Package;

public class MethodOverride6 extends MethodOverride5 {

	public void cook() {
		System.out.println("Sister is cooking");
	}

	public void angry() {
		System.out.println("Father is angry");
	}

	public static void main(String[] args) {

		MethodOverride6 mo6 = new MethodOverride6();
		mo6.cook(); // Sister is cooking
		mo6.angry(); // Father is angry

		MethodOverride5 mo5 = new MethodOverride5();
		mo5.cook(); // Mom is cooking
		mo5.eat(); // I am eating
		mo5.handwash(); // Please handwash

		// Dynamic Method Dispatch in Java
		MethodOverride5 mo7 = new MethodOverride6();
		mo7.cook(); // Sister is cooking
		mo7.eat(); // I am eating
		mo7.handwash(); // Please handwash
		// mo7.angry(); - undefined because of dynamic method dispatch concept

	}

}
