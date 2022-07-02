package Q3;

public class PlusThread extends Thread{

	Object lock1;
	private int start;
	private int range;
	
	public PlusThread(Object lock,int start, int range) {
		
		this.lock1 = lock;
		this.start = start;
		this.range = range;
	}
	
	public void addNumbers() {
		
		synchronized(lock1) {
			
			try {
				
				for(int i=start; i<=range; i++) {
					
					lock1.wait();
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+" => "+i+"+"+i+" = "+ (i+i));
					lock1.notify();
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	
	public void run() {
		
		Thread.currentThread().setName("Thread-0");
		addNumbers();
	}
}
