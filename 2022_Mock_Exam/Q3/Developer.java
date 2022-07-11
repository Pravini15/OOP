package Q3;

public class Developer {

	public static void main(String []args) {
		
		IDE ide = new IDE();
		Receiver intendedreceiver = new Receiver();
		System.out.println("Pressed save button!");
		SaveAction saveaction = new SaveAction(intendedreceiver);
		ide.setAction(saveaction);
		ide.ExecuteAction();
		
		System.out.println("Pressed saveall button");
		SaveAllAction saveallaction = new SaveAllAction(intendedreceiver);
		ide.setAction(saveallaction);
		ide.ExecuteAction();
		
	}
}
