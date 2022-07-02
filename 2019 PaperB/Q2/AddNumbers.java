package Q2;

public class AddNumbers extends Thread{

	DemoThread demoThread;
	private int begin;
	private int end;
	
	public AddNumbers(DemoThread demoThread, int begin, int end) {
		super();
		this.demoThread = demoThread;
		this.begin = begin;
		this.end = end;
	}
	
	public void addNumbers() {
		
		synchronized(demoThread) {
			
			try {
				
				for(int i=begin; i<=end; i++) {
					
				demoThread.wait();
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName()+" => "+i+" (+) "+i+" = "+i*i);
				demoThread.notify();
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
				
		}
	}
	
	public void run() {
		
		Thread.currentThread().setName("ADD");
		addNumbers();
	}
	
	
}
