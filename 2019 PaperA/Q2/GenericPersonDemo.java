package Q2;

import java.util.ArrayList;

public class GenericPersonDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<>();
		student.add(new Student("STD111",6));
		student.add(new Student("STD222",7));
		student.add(new Student("STD333",12));
		student.add(new Student("STD444",11));
		student.add(new Student("STD555",10));
		
		ArrayList<Lecturer> lecturer = new ArrayList<>();
		lecturer.add(new Lecturer("EMP000","IT"));
		lecturer.add(new Lecturer("EMP111","SE"));
		lecturer.add(new Lecturer("EMP222","CSN"));
		lecturer.add(new Lecturer("EMP333","EE"));
		lecturer.add(new Lecturer("EMP444","IS"));
		
		GenericPerson genericPerson = new GenericPerson();
		genericPerson.displayElements(student);
		genericPerson.displayElements(lecturer);
	}
}
