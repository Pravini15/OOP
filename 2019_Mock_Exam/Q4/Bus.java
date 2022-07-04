package Q4;

public class Bus extends vehicle{

	private int Year;
	private double manufacturerDiscount;
	
	public Bus(double speed,String colour,int Year,double md) {
		super(speed,colour);
		this.Year=Year;
		this.manufacturerDiscount=md;
	} 

	public double getSalePrice() {
		return super.regularPrice-manufacturerDiscount;
	}
	
	
	
}
