package Q2b;

public abstract class TV {
	
	 private String Model;
	 private float Price;
	    
	    
	 public TV(String model, float price) {
			Model = model;
			Price = price;
	 }
	 
	 public abstract void Display();

}
