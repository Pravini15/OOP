package Q2;

public class MultiplyNumbers extends Thread{

	DemoThread demoThread;
	private int begin;
	private int end;
	
	public MultiplyNumbers(DemoThread demoThread, int begin, int end) {
		super();
		this.demoThread = demoThread;
		this.begin = begin;
		this.end = end;
	}
	
	public void multiplyNumbers() {
		
		synchronized(demoThread) {
			
			try {
			for(int i=begin; i<=end; i++) {
				
				demoThread.notify();
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName()+" => "+i+" (*) "+i+" = "+i*i);
				demoThread.wait();
				
			   }
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
	public void run() {
		
		Thread.currentThread().setName("MUL");
		multiplyNumbers();
	}
	
}
