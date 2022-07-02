package Q4_b;

public class GarageGateOpen implements Command{

	GarageGate g;
	
	public GarageGateOpen(GarageGate g) {
		
		this.g = g;
	}

	public void execute() {
		g.Open();
	}
}
