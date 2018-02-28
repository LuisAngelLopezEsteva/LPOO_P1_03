package Capitulo_5.ProgrammingExercises.E5;

import java.util.Scanner;

public class Coffee {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer opc;
		double contador= 0.0;
		do {
			
			System.out.println("___________________"
			+ "\n   Kind      Price  "
			+ "\n (1)American 1.99\n"
			+ "\n (2)Espresso 2.50\n"  
			+ "\n (3)Latte    2.15\n"
			+ "\n (0)Salir  "  
			+ "\n___________________"
			+ "\n Elija una de las opciones:  ");
			opc = input.nextInt();
			
			switch(opc) {
			case 1:
				contador += 1.99;
				break;
			case 2:
				contador += 2.50;
				break;
			case 3:
				contador += 2.15;
				break;
			}
			}while(opc!=0);
		System.out.println("Total a pagar: $"+contador);
		}

}
