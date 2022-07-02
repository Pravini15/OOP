package Q4;

public class FishFlavour implements IPrepareDeliciously{

	private double cost= 80;
	
    public void addFlavour() {
		System.out.println("Added fish for the meal");
	}
	public double getCost() {
		return cost;
	}
}
