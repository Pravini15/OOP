package Q1;

public class DroneSatellite implements ISatellite{

	private String name;
	
	
	public DroneSatellite(String name) {
		
		this.name = name;
	}

	public void activate() {
		
		System.out.println(name+" drone satellite activate");
	}
	
	public void deactivate() {
		
		System.out.println(name+" drone satellite deactivate");
	}
}
