package Capitulo_5.ProgrammingExercises.E9;

public class Factura {

	int numero_factura;
	int saldo_adeuda;
	int dia;
	int mes;
	int anio;

	public Factura(int numero_factura, int saldo_adeuda, int dia, int mes, int anio) {
		this.numero_factura = numero_factura;
		this.saldo_adeuda = saldo_adeuda;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

	}

	public void mostrar() {
		if (numero_factura < 1000) {
			numero_factura = 0;
		}
		if (mes <= 1) {
			mes = 10;
		}
		if (mes >= 12) {
			mes = 10;
		}
		if (dia <= 1) {
			dia = 0;
		}

		if (dia >= 31) {
			dia = 0;

		}
		if (anio <= 2011) {
			anio = 0;
		}
		if (anio >= 2017) {
			anio = 0;
		}
		System.out.println("num factura: " + numero_factura);
		System.out.println("saldo adeudado: " + saldo_adeuda);
		System.out.println("dia: " + dia);
		System.out.println("mes: " + mes);
		System.out.println("anio: " + anio);

	}

}
