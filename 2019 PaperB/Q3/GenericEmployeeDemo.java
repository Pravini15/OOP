package Q3;

import java.util.ArrayList;

public class GenericEmployeeDemo {

	public static void main(String []args) {
		
		ArrayList<Engineer> engineers = new ArrayList<>();
		engineers.add(new Engineer("E000", "IFS"));
		engineers.add(new Engineer("E111", "Virtusa"));
		engineers.add(new Engineer("E222", "Virtusa"));
		engineers.add(new Engineer("E333", "Virtusa"));
		engineers.add(new Engineer("E444", "Virtusa"));
		
		
		ArrayList<Manager> managers = new ArrayList<>();
		managers.add(new Manager("MGD5555",250000.00));
		managers.add(new Manager("MG4444", 225000.00));
		managers.add(new Manager("MG3333", 175000.00));
		managers.add(new Manager("MG2222", 200000.00));
		managers.add(new Manager("MG1111", 150000.00));
		
		GenericEmployee genericEmployee = new GenericEmployee();
		genericEmployee.showElements(managers);
		genericEmployee.showElements(engineers);
		
	}
}
