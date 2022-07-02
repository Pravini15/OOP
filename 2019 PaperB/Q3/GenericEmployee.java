package Q3;

import java.util.ArrayList;

public class GenericEmployee<T extends IEmployee> {

	public void showElements(ArrayList<T> arrayList) {
		
		for(T ob: arrayList) {
			ob.showEmployeeDetails();
		}
	}
}
