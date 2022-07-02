package Q1;

public class RainFallSensor implements ISensor{

	private String name;
	
	public RainFallSensor(String name) {
		super();
		this.name = name;
	}

	public void  on() {
		
		System.out.println("RainFall sensor switch on");
	}
	
	public void  off() {
		
		System.out.println("Rainfall sensor switch off");
	
	}
}
