package Q2;

public class Login {

	private static Login uniqueinstance;
	
	private Login(){}
	
	public static Login getInstance() {
		
		if(uniqueinstance==null) {
			uniqueinstance=new Login();
		}
		
		return uniqueinstance;
	}
	
	public boolean validateUser(String user,String password) {
		
		if(user.equals(password)) {
			return true;
		}
		return false;
	}
	
}
	
