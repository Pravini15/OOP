package Q2;

public class Student implements IPerson{

	private String studentID;
	private int grade;
	
	public Student(String studentID, int grade) {
		
		this.studentID = studentID;
		this.grade = grade;
	}
	
	public void displayDetails() {
		
		System.out.println("Student = "+studentID+", Grade = "+grade);
	}
}
