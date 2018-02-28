package Capitulo_6.ProgrammingExercises.E12;

public class Population {

	public static void main(String[] args) {
		// TODO code application logic here
		double mexico = 114;
		double eua = 312;
		int i = 0;
		while (mexico < eua) {
			i++;
			mexico += (mexico * 0.01);
			eua -= (eua * .15);
			System.out.println("anio " + i + ": mexico : " + mexico);
			System.out.println("anio " + i + ": EUA : " + eua);
		}
	}

}
