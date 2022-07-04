package Q2b;

public class MobileFactory extends AbstractFactory{

	public MobilePhone getMobilePhone(String type) {
		if(type.equalsIgnoreCase("A10")) {
			return new A10("A10",20000);
		}
		
		if(type.equalsIgnoreCase("TPlus")) {
			
			return new X25("X25",45000);
		}
		
		if(type.equalsIgnoreCase("X25")) {
			return new X25("X25",70000);
		}
		
		else {
			return null;
		}
	}
	
	public TV getTV(String type) {
		return null;
	}
	
	
}
