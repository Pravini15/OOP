package Q2;

public class CalcSum implements Runnable{

	public void run() {
		
		int sum=0;
		
		for(int i=1; i<100000; i++) {
			
			sum=sum+i;
		}
		
		System.out.println("The sum is "+sum);
		System.out.println(Thread.currentThread().getName());
	}
	
}
