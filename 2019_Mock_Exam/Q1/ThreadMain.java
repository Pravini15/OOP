package Q1;

public class ThreadMain {

	public static void main(String[] args) {
		
		PrintThread t1=new PrintThread();
		Thread t2 = new Thread(new SLIITThread());
		
		t1.start();
		
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
	}
}
