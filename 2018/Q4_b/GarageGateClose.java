package Q4_b;

public class GarageGateClose implements Command{

	GarageGate g;
	
    public GarageGateClose(GarageGate g) {
		
		this.g = g;
	}

	public void execute() {
		g.Close();
	}
}
