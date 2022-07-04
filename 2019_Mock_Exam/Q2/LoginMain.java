package Q2;

public class LoginMain {

	public static void main(String []args) {
		
		Login l = Login.getInstance();
		
		System.out.println(" "+l.validateUser("Pravini","Pravini"));
		
	}
}
