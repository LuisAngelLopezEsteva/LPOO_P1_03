package Capitulo_6.ProgrammingExercises.E1;

public class CountByFives {

	public static void main(String[] args) {

		System.out.println("cuenta de:");
		for (int i = 5; i <= 200; i++) {

			if ((i % 5) == 0) {
				System.out.println(i);
			}

		}

		System.out.println("\n\ncuenta de:");
		for (int j = 50; j <= 200; j++) {

			if ((j % 50) == 0) {
				System.out.println(j);
			}

		}

	}

}
