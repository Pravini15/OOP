package Q1;

public abstract class Item {

	private int itemNo;
	private String description;
	private double unitPrice;
	
	public Item(int itemNo, String description, double unitPrice) {
		
		this.itemNo=itemNo;
		this.description=description;
		this.unitPrice=unitPrice;
			
	}
	
	public void Display() {
		
		System.out.println("Item no : "+itemNo);
		System.out.println("description : "+description);
		System.out.println("Unit price : "+unitPrice);
	}
	
	
}
