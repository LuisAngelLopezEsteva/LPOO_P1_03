package Capitulo_7.ProgrammingExercises.E7;

public class DemonstratingStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "You can never cross the ocean until you have the courage to lose sight of the shore.";
		Integer opc;
		System.out.println("1.- La posición de la primera aparición de carácter"
				+ "\n2.- El carácter que está en la posición n "
				+ "\n3.- Prueba si esta cadena termina con el sufijo especificado."
				+ "\n4.- una nueva cadena resultante de reemplazar todas las ocurrencias de oldChar en esta cadena con newChar.");
		
		System.out.println("\n1.- La posición de la primera aparición de carácter ");
		System.out.println("Posicion v: "+ cadena.indexOf("v"));
		System.out.println("Posicion x: "+ cadena.indexOf("x"));
		
		System.out.println("\n2.- El carácter que está en la posición n ");
		System.out.println("caracter en indice(16):" + cadena.charAt(16));
		
		System.out.println("\n3.- Prueba si esta cadena termina con el sufijo especificado.");
		System.out.println("prueba con - bus - : "+ cadena.endsWith("bus"));
		System.out.println("prueba con - car - : "+ cadena.endsWith("car"));
		
		System.out.println("\n4.- una nueva cadena resultante de reemplazar todas las ocurrencias de oldChar en esta cadena con newChar.");
		System.out.println("Cadena con remplazo c a C: \n" + cadena.replace('c', 'C'));
	}

}
//l
//indexOf('v')
//l
//indexOf('x')
//l
//charAt(16)
//l
//endsWith("bus")
//l
//endsWith("car")
//l
//replace('c', 'C')
