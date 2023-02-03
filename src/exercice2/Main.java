package exercice2;

public class Main {

	public static void main(String[] args) {
		
		Cours cours = new Cours("Informatique 101");

	    Student student1 = new Student("N'GUESSAN EMMANUELLE", 18, 2.5);
	    Student student2 = new Student("TOURE PRINCESSE", 21, 5.8);
	    Student student3 = new Student("ISHOLA AÎSHA", 15, 1.5);
	    cours.addStudent(student1);
	    cours.addStudent(student2);
	    cours.addStudent(student3);

	    System.out.println("Liste des étudiants:");
	    cours.printStudents();

	    cours.removeStudent(student3);

	    System.out.println("\nListe des étudiants après la suppression de ISHOLA AÎSHA:");
	    cours.printStudents();
	}

}
