package Q1;

public class NavigationSatellite implements ISatellite{

	private String name;
	
	
	public NavigationSatellite(String name) {
		super();
		this.name = name;
	}

	public void activate() {
		
		System.out.println(name+" navigational satellite activate");
	}
	
	public void deactivate() {
		
		System.out.println(name+" navigational satellite deactivate");
	}
}
