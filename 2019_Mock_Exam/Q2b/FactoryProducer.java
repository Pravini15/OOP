package Q2b;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type) {
		
		if(type.equalsIgnoreCase("MobilePhone")) {
			return new MobileFactory();
	     }
		else if(type.equalsIgnoreCase("TV")) {
		    return new TVFactory();
         }
	    else {
	      	return null;
       	}
	}
}
