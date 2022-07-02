package Q4_b;

public class OvenOff implements Command{

	Oven ob;
	
	public OvenOff(Oven ob) {

		this.ob = ob;
	}

	public void execute() {
		
		ob.off();
	}
}
