package Capitulo_8.ProgrammingExercises.E1;

public class EightInts {
	public static void main(String[] args) {
		// TODO code application logic here
		int[] matriz = new int[8];

		for (int i = 0; i < 8; i++) {
			matriz[i] = i + 1;
		}

		for (int i = 0; i < 8; i++) {
			System.out.println(matriz[i]);
		}
		System.out.println();
		for (int i = 7; i >= 0; i--) {
			System.out.println(matriz[i]);
		}
	}
}
