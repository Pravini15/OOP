package Q2_b;

public class MainThreadApp {

	public static void main(String []args) throws InterruptedException {
		
		Calculation c1 = new Calculation();
				
		ParralelThread pt1 = new ParralelThread(c1,1,10);
		ParralelThread pt2 = new ParralelThread(c1,11,20);
		ParralelThread pt3 = new ParralelThread(c1,21,30);
		ParralelThread pt4 = new ParralelThread(c1,31,40);
		
		pt1.start();
		pt1.join();
		
		pt2.start();
		pt2.join();
		
		pt3.start();
		pt3.join();
		
		pt4.start();
		pt4.join();
		
		System.out.println("Factorial of 40 = "+c1.getAns());
	}
}
