package Q4;

public class GamFest implements IFestival{

	
	public void performEvent() {
		
		System.out.println("Perform Game Fest Event for "+getBudget());
	}

    public double getBudget() {
		
		return 400000;
	}

}
