package Java_Package;

public class ExceptionHandling4 {

	public static void main(String[] args) {

		try {
			int i = 20 / 2;
		} finally {
			System.out.println("finally will always executed");

			try {
				int a = 5 / 0;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("finally inside finally");
			}
		}
		System.out.println("Exception Handled");

	}

}
