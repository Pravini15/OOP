package Q3;

public class MultiplyThread extends Thread{

	    Object lock1;
	    int start;
	    int range;
	    
		public MultiplyThread(Object lock, int start, int range) {
			
			this.lock1 = lock;
			this.start = start;
			this.range = range;
		}
	    
	    public void multiplyNumbers() {
	    	
	    	synchronized (lock1) {
	    		
	    		try {
	    			
	    			for (int i = start ; i <= range ; ++i) {
	    			lock1.notify();
	    			Thread.sleep(100);
	    			System.out.println(Thread.currentThread().getName()+" => "+i+"*"+i+" = "+ i*i);
	    			lock1.wait();
	    			}
	    			
	    		}catch(InterruptedException e) {
	    			e.printStackTrace();
	    		}
	    	}
	    }
	    
	    
	    public void run() {
	    	
	    	Thread.currentThread().setName("Thread-1");
	    	multiplyNumbers();
	    }
	
}
