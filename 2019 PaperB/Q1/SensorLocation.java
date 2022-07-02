package Q1;

public class SensorLocation implements IMotionTracker{
	
	private String location;
	
	
	public SensorLocation(String location) {
		this.location = location;
		
	}


	public void displayLocation() {
		
		System.out.println("Sensor Location is = "+location);
	}

}
