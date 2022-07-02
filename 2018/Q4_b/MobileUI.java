package Q4_b;

public class MobileUI {

	Command c[];

	public MobileUI() {
		
		this.c = new Command[6];
	}
	
	public void setCommand(int index, Command cmdObj) {
		
		c[index]=cmdObj;
	}
	
	public void commmandPressed(int index) {
		
		c[index].execute();
	}
}
