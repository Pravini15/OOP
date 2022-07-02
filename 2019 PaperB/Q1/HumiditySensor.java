package Q1;

public class HumiditySensor implements ISensor{

    private String name;
	
	public HumiditySensor(String name) {
		super();
		this.name = name;
	}
	public void  on() {
	     System.out.println("Humidity sensor switch on");
	}
	
	public void  off() {
		 System.out.println("Humidity sensor switch off");
	}

}
