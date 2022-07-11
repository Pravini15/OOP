package Q3;

public class SaveAllAction implements Command{

	Receiver receiver;

	public SaveAllAction(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	public void execute() {
		
		receiver.saveall();
	}
}
