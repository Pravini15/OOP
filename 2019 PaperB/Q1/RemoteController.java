package Q1;

public class RemoteController {

	private int Switch;
    ISensor[] isensor;
    IMotionTracker[] iMotionTracker;
    
	public RemoteController(int switch1, ISensor[] isensor,IMotionTracker[] iMotionTracker) {
		super();
		this.Switch = switch1;
		this.isensor = isensor;
		this.iMotionTracker=iMotionTracker;
	}
	
	public void startService() {
		
		
		isensor[Switch].on();
		
	}
	
	public void stopService() {
		
		
		isensor[Switch].off();
		
	}
	
	public void locationService() {
		iMotionTracker[Switch].displayLocation();
	}
}
