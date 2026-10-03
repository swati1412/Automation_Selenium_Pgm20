package Java_Package;

public abstract class Abstraction1 {

	static int a = 5; // static variable
	int b = 5; // global Variable
	final int c = 10; // final variable

	// abstract method
	public abstract void eat();

	// Non abstract method
	public void a() {
		System.out.println("non abstract method");
	}

}
