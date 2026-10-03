package Java_Package;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		// Exception Handled - finally will execute always
		try {
			int j = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception Handled");
		} finally {
			System.out.println("finally executed - exception handled");
		}

		// Exception is not Handled - finally will execute always
		try {
			int i = 10 / 0;
		} finally {
			System.out.println("finally executed - Exception not handled");
		}

	}

}
