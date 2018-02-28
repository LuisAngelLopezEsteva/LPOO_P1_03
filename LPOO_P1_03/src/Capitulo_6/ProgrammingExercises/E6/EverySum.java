package Capitulo_6.ProgrammingExercises.E6;

public class EverySum {

	private static int contador = 1;

	public static void main(String[] args) {

		for (int i = 1; contador <= 50; i++) {

			contador = contador + (i + 1);
			if (contador > 50) {
				System.out.println("");
			} else
				System.out.println(contador);
		}

	}

}
