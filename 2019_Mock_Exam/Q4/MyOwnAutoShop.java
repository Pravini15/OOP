package Q4;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Truck t =new Truck(150, "Blue", 1000);
		Bus b = new Bus(150, "Blue", 2019,1000);
		
		System.out.println(t.getSalePrice());
		System.out.println(b.getSalePrice());
	}
}
