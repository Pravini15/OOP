package Q1;

public class SatelliteDemo {

	public static void main(String[] args) {
		
		ISatellite navigationalSatellite = new NavigationSatellite("Ravana-01");
		IGeoLocation locationTracker1 = new SatelliteLocation("SriLanka");
		ISatellite droneSatellite =  new DroneSatellite("Ravana-02");
		IGeoLocation locationTracker2 = new SatelliteLocation("Russia");
		ISatellite droneSatellite1 =  new DroneSatellite("Eclipse-01");
		IGeoLocation locationTracker3 = new SatelliteLocation("Dubai");
		
		ISatellite [] satelliteArray =new ISatellite[] {navigationalSatellite, droneSatellite,droneSatellite1};
		IGeoLocation[] trackArray = new IGeoLocation[] {locationTracker1,locationTracker2,locationTracker3};
		
		SatelliteCenter satellitecenter = new SatelliteCenter(0, satelliteArray,trackArray);
		satellitecenter.startService();
		satellitecenter.stopService();
		satellitecenter.locationService();
		
		SatelliteCenter remoteController = new SatelliteCenter(1, satelliteArray,trackArray);
		remoteController.startService();
		remoteController.stopService();
		remoteController.locationService();	
		
		SatelliteCenter newdrone = new SatelliteCenter(2, satelliteArray,trackArray);
        newdrone.startService();
		newdrone.stopService();
		newdrone.locationService();	
		
	}
}
