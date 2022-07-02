package Q4;

public class RoboFest implements IFestival{
	
	public void performEvent() {
		
		System.out.println("Perform Robo Fest Event for "+getBudget());
	}

	public double getBudget() {
		
		return 400000;
	}

}
