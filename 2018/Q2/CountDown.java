package Q2;

public class CountDown extends Thread {

	public void run() {
		
		for (int i=0; i<10; i++) {
			
			System.out.println(i+1);
			
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
