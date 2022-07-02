package Q4;

public class EggFlavour implements IPrepareDeliciously{

	private double cost = 60;
	
	public void addFlavour() {
		System.out.println("Added Eggs for the meal");
	}
	public double getCost() {
		return cost;
	}

}
