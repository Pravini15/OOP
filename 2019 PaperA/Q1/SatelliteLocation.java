package Q1;

public class SatelliteLocation implements IGeoLocation{

	private String location;
	
	
	
	public SatelliteLocation(String location) {
		super();
		this.location = location;
	}



	public void displayLocation() {
		System.out.println("Satellite Location is = "+location);
	}
}
