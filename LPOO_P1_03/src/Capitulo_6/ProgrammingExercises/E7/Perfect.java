package Capitulo_6.ProgrammingExercises.E7;

public class Perfect {

	private static int i;
	private static int j;
	private static int suma;

	public static void main(String[] args) {

		System.out.println("Números perfectos entre 1 y 1000: ");

		for (i = 1; i <= 1000; i++) {
			suma = 0;

			for (j = 1; j < i; j++) {

				if (i % j == 0) {
					suma = suma + j;
				}

			}

			if (i == suma) {

				System.out.println(i);

			}

		}

	}

}
