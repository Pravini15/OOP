package Q2;

public class DemoThread {

	public static void main(String []args) {
		
		DemoThread demoThread = new DemoThread();
		Thread addNumbers = new Thread(new AddNumbers(demoThread, 10, 20),"ADD");
		Thread multiplyNumbers = new Thread(new MultiplyNumbers(demoThread,10,20),"MUL");
		addNumbers.start();
		multiplyNumbers.start();
		
	}
}
