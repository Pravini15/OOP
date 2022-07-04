package Q2b;

public class TVFactory extends AbstractFactory{

	public TV getTV(String type) {
		
		if(type.equalsIgnoreCase("Alpha40")) {
			return new Alpha40("A10",20000);
		}
		   
		if(type.equalsIgnoreCase("Gamma50")) {
			
			return new Gamma50("Gamma50",45000);
		}
		
		if(type.equalsIgnoreCase("Theta65")) {
			return new Theta65("Theta65",70000);
		}
		
		else {
			return null;
		}
	}
	public MobilePhone getMobilePhone(String type) {
		return null;
	}
	
}
