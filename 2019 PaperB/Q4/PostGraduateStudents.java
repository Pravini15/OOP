package Q4;

public class PostGraduateStudents extends Students{

	public void displayStudents() {
		offerPrograms();
		conductEvents();
		displayCost();
		
		System.out.println("Display Post graduate students");
	}
	
	public void displayCost() {
		
		System.out.println("Cost for the Post graduate program is = "+iprogram.getCost());
	}
}
