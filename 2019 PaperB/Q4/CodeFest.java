package Q4;

public class CodeFest implements IFestival{

	public void performEvent() {
		
		System.out.println("Perform Code Fest Event for "+getBudget());
	}

	public double getBudget() {
		
		return 300000;
	}

}
