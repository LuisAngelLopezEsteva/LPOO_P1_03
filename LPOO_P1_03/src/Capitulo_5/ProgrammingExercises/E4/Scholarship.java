package Capitulo_5.ProgrammingExercises.E4;

import java.util.Scanner;

public class Scholarship {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double promedio, activExtracurriculares, activServicio;
		String mensaje;
		System.out.println("Ingrese su promedio de calificaciones :  ");
		promedio = input.nextDouble();
		System.out.println("Ingrese el número de actividades extracurriculares :  ");
		activExtracurriculares = input.nextDouble();
		System.out.println("Ingrese la cantidad de actividades de servicio:   ");
		activServicio = input.nextDouble();
		
		mensaje = "No es candidato";
		if ((promedio >= 3.8) && (activExtracurriculares >= 1) && (activServicio >= 1) ) {
			mensaje = "Becario candidato" ;
		}
		
		if ((promedio >= 3.4) && (activExtracurriculares >= 3) && (activServicio >= 3) ) {
			mensaje = "Becario candidato" ;
		}
		
		if ((promedio >= 3.0) && (activExtracurriculares >= 2) && (activServicio >= 3) ) {
			mensaje = "Becario candidato" ;
		}
		
		System.out.println(mensaje);
	}

}
