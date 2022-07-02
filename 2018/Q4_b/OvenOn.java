package Q4_b;

public class OvenOn implements Command{

	Oven ob;

	public OvenOn(Oven ob) {
		
		this.ob = ob;
	}

	public void execute() {
		
		ob.on();
	}
	
	
}
