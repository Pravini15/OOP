package Q1;

public class PrintThread extends Thread{

	public void run() {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+"  ");
		}
		
		System.out.println("");
	}
	
}
