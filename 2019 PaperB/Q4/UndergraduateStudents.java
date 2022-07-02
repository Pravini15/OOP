package Q4;

public class UndergraduateStudents extends Students{

	public void displayStudents() {
		offerPrograms();
		conductEvents();
		displayCost();
		
		System.out.println("Display under graduate students");
	}
	
	public void displayCost() {
		System.out.println("Cost for the undergraduate program is = "+iprogram.getCost());
	}
	
	
}
