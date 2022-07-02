package Q1;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
	
		ArrayList<Item> al=new ArrayList<>();
		
		Item b1= new Book(101,"A good book",400,"Dr.Wijethunga","Novel",800);
		Item b2 =new Book(102,"A Science book",700,"P.K.Yapa","Fiction",580);
		
		al.add(b1);
		al.add(b2);
		
		Item c1=new Car(3465,"Latest Benz",100000000,"Benz","Car");
		Item c2=new Car(2456,"Latest Audi",800000000,"Audi","Cab");
		
		al.add(c1);
		al.add(c2);
		
		for(Item i:al) {
			i.Display();
			System.out.println();
		}
	}
}
