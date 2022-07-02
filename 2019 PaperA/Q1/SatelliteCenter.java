package Q1;

public class SatelliteCenter {

	private int option;
	ISatellite ISatellite[];
	IGeoLocation IGeoLocation[];
	
	public SatelliteCenter(int option,ISatellite[] iSatellite,IGeoLocation[] iGeoLocation) {
		super();
		this.option = option;
		ISatellite = iSatellite;
		IGeoLocation = iGeoLocation;
	}
	
	public void startService() {
		
		if(option==0) {
			ISatellite[0].activate();
		}
		if(option==1) {
			ISatellite[1].activate();
		}
	}
	
    public void stopService() {
		
		if(option==0) {
			ISatellite[0].deactivate();
		}
		if(option==1) {
			ISatellite[1].deactivate();
		}
	}
	
    public void locationService() {
    	
    	if(option==0) {
			IGeoLocation[0].displayLocation();
		}
		if(option==1) {
			IGeoLocation[1].displayLocation();
		}
    }
}
