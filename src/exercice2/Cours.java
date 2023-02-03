package exercice2;
import java.util.ArrayList; 

public class Cours {
	
	
	private final ArrayList<Student> students;

	  public Cours(String name) {
	    students = new ArrayList<>();
	  }

	  public void addStudent(Student student) {
	    students.add(student);
	  }

	  public void removeStudent(Student student) {
	    students.remove(student);
	  }

	  public void printStudents() {
	    for (Student student : students) {
	      System.out.println(student.getName());
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
