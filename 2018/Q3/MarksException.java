package Q3;

public class MarksException extends Exception{

	private float marks;

	public MarksException(float marks) {
		
		this.marks = marks;
	}
	
	public float getMarks() {
		return marks;
	}

}
