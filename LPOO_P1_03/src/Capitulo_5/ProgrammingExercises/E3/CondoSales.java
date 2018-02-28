package Capitulo_5.ProgrammingExercises.E3;

import java.util.Scanner;

public class CondoSales {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer opc;
		Double precio =0.0;
		Double garage =0.0;
		
		String eleccion="";
		
		System.out.println("------Opciones----- " + "\n 1.- Parque" + "\n 2.- Campo de Golf" + "\n 3.- Lago");
		System.out.println("-------------------");
		System.out.println("Ingrese una opcion : ");
		opc = input.nextInt();

		switch (opc) {
		case 1:
			eleccion = " Parque ";
			precio = 150000.00;
			garage = 5000.0;
			break;
		case 2:
			eleccion = " Campo de Glof ";
			precio = 170000.00;
			garage = 5000.0;
			break;
		case 3:
			eleccion = " Lago ";
			precio = 210000.00;
			garage = 5000.0;
			break;

		default:
			break;
		}
		if(opc >3 || opc <1 ) eleccion = " no entrar " ;
		System.out.println("Usted ha elegido "+ eleccion +" y su precio es $" + (precio + garage ) );
	}

}
