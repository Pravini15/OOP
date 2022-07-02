package Q4_b;

public class MainApp {

	
	public static void main(String[] args) {
		
		MobileUI m = new MobileUI();
		Oven mainOven = new Oven("mainOven");
		GarageGate garageGate = new GarageGate("garageGate");
		
		OvenOn ovenOn = new OvenOn(mainOven);
		OvenOff ovenOff = new OvenOff(mainOven);
		
		GarageGateOpen openGarageGate = new GarageGateOpen(garageGate);
		GarageGateClose closeGarageGate = new GarageGateClose(garageGate);	
		
		m.setCommand(0,ovenOn);
		m.setCommand(1,ovenOff);
		m.setCommand(2,openGarageGate);
		m.setCommand(3,closeGarageGate);
		
		m.commmandPressed(0);
		m.commmandPressed(1);
		m.commmandPressed(2);
		m.commmandPressed(3);
	}
}
