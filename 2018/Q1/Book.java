package Q1;

public class Book extends Item{

	private String publisher;
	private String category;
	private int pages;
	
	public Book(int itemNo, String description, double unitPrice,String publicher,String category,int pages) {
		
		super(itemNo, description, unitPrice);
		this.publisher=publisher;
		this.category=category;
		this.pages=pages;
		
	}
	
	public void Display() {
		
		super.Display();
		System.out.println("Publisher : "+publisher);
		System.out.println("Category : "+category);
		System.out.println("Pages : "+pages);
		
	}
}
