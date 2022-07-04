package Q4;

public abstract class vehicle {

	private double speed;
    double regularPrice=1000000;
	private String colour;
	
	public vehicle(double speed, double regularPrice, String colour) {
		
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.colour = colour;
	}
	
	public vehicle(double speed, String colour) {
		
		this.speed = speed;
		this.colour = colour;
	}
	
	public double getRegularPrice() {
		return regularPrice;
	}
	
	public abstract double getSalePrice();
}
