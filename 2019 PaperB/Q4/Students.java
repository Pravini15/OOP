package Q4;

public abstract class Students {

	IPrograms iprogram;
	IFestival ifestival;
	
	public void setFestival(IFestival ifestival) {
		
		 this.ifestival = ifestival;
	}
	public void setPrograms(IPrograms iprogram) {
		
		this.iprogram = iprogram;
	}
	
	public void offerPrograms() {
		iprogram.offerPrograms();
	}
	
	public void conductEvents() {
		ifestival.performEvent();
	}
	
	public abstract void displayStudents();
		
	public abstract void displayCost();
}
