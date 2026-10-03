package Java_Package;

public class Identifiers {

	public static void main(String[] args) {
		
		int a = 1; // allowed
		int A = 1; // allowed
		
		char stshammi = 'b'; // not allowed
		char Shammi1st = 'b'; // allowed
	}
	
	// Not allowed - special character @
	public void amethod(){
		
	}
	
	// allowed special character _
	public void a_method() {
		int a$123 = 500; // allowed special character $
	}
	

}
