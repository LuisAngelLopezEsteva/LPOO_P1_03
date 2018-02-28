package Capitulo_7.ProgrammingExercises.E2;

public class CountSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "The person who says something is impossible should not interrupt the person who is doing it." ;
		Integer cont=0;
		
		for(int x =0 ; x < text.length() ; x++) {
			if(text.substring(x,x+1).equals(" "))
				cont++;
			
		}
		System.out.println("Numero de veces que se repite el \" \" : "+cont);
		
	}

}
