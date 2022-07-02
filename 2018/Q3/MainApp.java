package Q3;

public class MainApp {

	public static void main(String[] args) {
		
		Student s1 = new Student(1005,"Mala");
		
		s1.input();
		
		System.out.println("Average marks : "+s1.getAverage());
	}
}
