package Capitulo_5.ProgrammingExercises.E2;

import java.util.Scanner;

public class Temperatures {
	/*
	 * Escriba una aplicación que le indique al usuario las temperaturas altas y
	 * bajas del día. Si el valor alto es mayor o igual a 90 grados, visualice el
	 * mensaje "Advertencia de calor". Si el valor bajo es inferior a 32 grados,
	 * visualice el mensaje "Advertencia de congelación". Si la diferencia entre las
	 * temperaturas altas y bajas es superior a 40 grados, muestre el mensaje
	 * "Gran oscilación de temperatura". Guarde el archivo como Temperaturas.java.
	 * 
	 */
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float high, low;
		
		System.out.println("Ingrese la temperatura alta: ");
		high = input.nextFloat();
		System.out.println("Ingrese la temperatura baja: ");
		low = input.nextFloat();
		if (high >= 90)
		System.out.println("Advertencia de calor");

		if (low < 32)
			System.out.println("Advertencia de congelación");
		
		if( (high - low) >40  ) System.out.println("Gran oscilación de temperatura");
		
		
		System.out.println("No message");
	}

}
