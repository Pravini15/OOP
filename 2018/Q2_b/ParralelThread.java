package Q2_b;

public class ParralelThread extends Thread{

	Calculation myCalc;
	int start;
	int end;
	
	public ParralelThread(Calculation myCalc, int start, int end) {
		super();
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		myCalc.Factorial(start,end);
	}
	
}
