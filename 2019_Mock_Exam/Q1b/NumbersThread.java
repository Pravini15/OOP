package Q1b;

public class NumbersThread extends Thread{

	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i=1; i<=100; i++) {
			
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
}
