package Q2;

public class Lecturer implements IPerson{

	private String employeeID;
	private String department;
	
	public Lecturer(String employeeID, String department) {
		
		this.employeeID = employeeID;
		this.department = department;
	}
	
	public void displayDetails() {
		
		System.out.println("Lecturer = "+employeeID+", Department = "+department);
	}
	
	
}
