package Q3;

public class SaveAction implements Command{

	Receiver receiver;

	public SaveAction(Receiver receiver) {
		
		this.receiver = receiver;
	}
	
	public void execute() {
		
		receiver.save();
	}
}
