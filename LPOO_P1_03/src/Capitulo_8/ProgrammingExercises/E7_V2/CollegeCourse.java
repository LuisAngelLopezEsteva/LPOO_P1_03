package Capitulo_8.ProgrammingExercises.E7_V2;

public class CollegeCourse {
	private String id;
	private int creditos;
	private char calif;

	public String getCourseID() {
		return id;
	}

	public int getCreditHours() {
		return creditos;
	}

	public char getLetterGrade() {
		return calif;
	}

	public void setCourseID(String i) {
		id = i;
	}

	public void setCreditHours(int c) {
		creditos = c;
	}

	public void setLetterGrade(char l) {
		calif = l;
	}
}