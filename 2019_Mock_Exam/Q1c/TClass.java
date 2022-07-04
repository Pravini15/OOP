package Q1c;

public class TClass extends Thread{

	Calculation c;
	private int start;
	private int end;
	
	public TClass(Calculation c, int start, int end) {
		
		this.c = c;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		
		c.sum(start,end);
	}
}
