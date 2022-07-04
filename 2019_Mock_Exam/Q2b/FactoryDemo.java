package Q2b;

public class FactoryDemo {

	public static void main(String[] args) {
		AbstractFactory af = FactoryProducer.getFactory("mobilephone");
		MobilePhone mp = af.getMobilePhone("a10");
		mp.Display();
		
		FactoryProducer.getFactory("mobilephone").getMobilePhone("t25").Display();
		FactoryProducer.getFactory("mobilephone").getMobilePhone("x25").Display();
		
		FactoryProducer.getFactory("tv").getTV("alpha40").Display();
		FactoryProducer.getFactory("tv").getTV("gamma50").Display();
		FactoryProducer.getFactory("tv").getTV("theta65").Display();
	}
	
}
