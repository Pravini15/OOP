package Q4;

public class Truck extends vehicle{

	private double weight;

	public Truck(double speed, String colour,double weight) {
		super(speed, colour);
		this.weight=weight;
		
	}

	public double getSalePrice() {
		
		if(weight>2000) {
			return super.regularPrice * 90 / 100;
		}
		else {
			return super.regularPrice * 80 / 100;
		} 
	}

	
	
}
