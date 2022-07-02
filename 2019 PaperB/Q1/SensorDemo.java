package Q1;

public class SensorDemo {

	public static void main(String[] args) {
		
		ISensor humiditySensor =  new HumiditySensor("Humidity");
		IMotionTracker humidityTracker = new SensorLocation("Colombo");
		ISensor rainFallSensor = new RainFallSensor("Rainfall");
		IMotionTracker rainFallTracker = new SensorLocation("Kandy");
		
		ISensor [] sensorArray = new ISensor[] {humiditySensor, rainFallSensor};
		IMotionTracker [] trackerArray = new IMotionTracker[] {humidityTracker, rainFallTracker};
		
		RemoteController remoteController = new RemoteController(0, sensorArray, trackerArray);
		remoteController.startService();
		remoteController.stopService();
		remoteController.locationService();
		
		RemoteController remoteController2 = new RemoteController (1,sensorArray, trackerArray);
		remoteController2.startService();
		remoteController2.stopService();
		remoteController2.locationService();
		
	}
	
}

