package Java_Package;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		// Handle NullPointerException
		String s = null;
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("NullPointerException Handled");
		}

		// Handle NumberFormatException
		String t = "Selenium";
		try {
			int i = Integer.parseInt(t);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException Handled");
		}

		// Handle ArrayIndexOutOfBoundException
		int a[] = new int[3];
		try {
			a[4] = 50;
		} catch (Exception e) {
			System.out.println("ArrayIndexOutOfBoundException Handled");
		}
	}

}
