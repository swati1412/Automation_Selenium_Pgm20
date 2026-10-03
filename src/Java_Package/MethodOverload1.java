package Java_Package;

public class MethodOverload1 {

	public void aMethod(int a) {
		System.out.println("int parameter");
	}

	public void aMethod() {
		System.out.println("no parameter");
	}

	public void aMethod(int a, String b) {
		System.out.println("2 parameters");
	}

	public static void main(String[] args) {
		MethodOverload1 mo1 = new MethodOverload1();
		mo1.aMethod(); // No Parameter
		mo1.aMethod(1); // int parameter
		mo1.aMethod(5, "Shammi"); // 2 parameters
	}

}
