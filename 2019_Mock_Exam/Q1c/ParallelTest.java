package Q1c;

public class ParallelTest {

	public static void main(String[] args) {
		
		Calculation c1 = new Calculation();
		TClass t1 = new TClass(c1,1,50000);
		TClass t2 = new TClass(c1,50001,100000);
		
		try {
			t1.start();
			t1.join();
			
			t2.start();
			t2.join();
			
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
		
		System.out.println("Total : "+c1.getTotal());
		
	}
}
