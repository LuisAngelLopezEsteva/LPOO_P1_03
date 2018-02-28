package Capitulo_8.ProgrammingExercises.E7_V2;

public class Student {
	private int studentID;
	private CollegeCourse[] course = new CollegeCourse[4];

	public int getStudentID() {
		return studentID;
	}

	public CollegeCourse getCourse(int p) {
		return course[p];
	}

	public void setStudentID(int i) {
		studentID = i;
	}

	public void setCourse(CollegeCourse c, int p) {
		course[p] = c;
	}

}
