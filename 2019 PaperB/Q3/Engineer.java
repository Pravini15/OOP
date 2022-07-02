package Q3;

public class Engineer implements IEmployee{

	private String employeeID;
	private String company;
	
	public Engineer(String employeeID, String company) {
		super();
		this.employeeID = employeeID;
		this.company = company;
	}
	
	public void showEmployeeDetails() {
		System.out.println("Engineer = "+employeeID+", Company = "+company);
	}
}
