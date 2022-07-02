package Q3;

public class Manager implements IEmployee{

	private String managerID;
	private double salary;
	
	
	
	public Manager(String managerID, double salary) {
		super();
		this.managerID = managerID;
		this.salary = salary;
	}



	public void showEmployeeDetails () {
		
		System.out.println("Manager ID = "+managerID+ ", Salary = "+salary);
		
	}
	
}
