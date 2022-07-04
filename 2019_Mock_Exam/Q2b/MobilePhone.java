package Q2b;

public abstract class MobilePhone {

    private String Model;
    private float Price;
    
    
    public MobilePhone(String model, float price) {
		Model = model;
		Price = price;
	}


	public abstract void Display();
}
