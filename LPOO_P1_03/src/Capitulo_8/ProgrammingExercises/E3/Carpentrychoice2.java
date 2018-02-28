package Capitulo_8.ProgrammingExercises.E3;

import java.util.Scanner;

public class Carpentrychoice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mueble;
		Integer precio;

		String[] muebles = { "mesa", "escritorio", "tocador", "centro de entretenimiento" };

		for (int i = 0; i < 4; i++) {
			System.out.println(i + 1 + ".-" + muebles[i]);
		}
		do {
			System.out.println("Escriba el mueble que desea o las primeras tres letras del mueble");
			mueble = input.nextLine();
			switch (mueble) {
			case "mesa":
			case "MESA":
			case "MES":
			case "mes":
				precio = 250;
				break;
			case "escritorio":
			case "ESCRITORIO":
			case "esc":
			case "ESC":
				precio = 325;
				break;
			case "tocador":
			case "TOCADOR":
			case "toc":
			case "TOC":
				precio = 420;
				break;
			case "centro de entretenimiento":
			case "CENTRO DE ENTRETENIMEINTO":
			case "cen":
			case "CEN":
				precio = 600;
				break;
			default:
				precio = 0;
				break;
			}

		} while (precio == 0);

		System.out.println("Pase a pagar: $" + precio);
	}

}
