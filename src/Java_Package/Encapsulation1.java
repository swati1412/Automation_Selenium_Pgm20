package Java_Package;

public class Encapsulation1 {

	Object inputData; // Global Variable
	final int c = 2; // final variable

	public void a() {
		// c = 5; // final variable can not change the value.
	}

	// final method
	final void d() {
		System.out.println("Hello final method");
	}

	public void setData(Object s) {
		inputData = s;
	}

	public Object getData() {
		return inputData;
	}

}
