package Capitulo_5.ProgrammingExercises.E9;

public class Invoice2 {

	int numero_factura;
	int saldo_adeuda;
	int dia;
	int mes;
	int anio;

	public Invoice2(int numero_factura, int saldo_adeuda, int dia, int mes, int anio) {
		this.numero_factura = numero_factura;
		this.saldo_adeuda = saldo_adeuda;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int mostra() {
		if (numero_factura < 1000) {
			numero_factura = 0;
		}

		this.dia++;
		if (this.dia > mam()) {
			this.dia = 1;
			this.mes++;
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
		return 0;

	}

	private int mam() {
		switch (this.mes) {

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12:

			return 31;
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:

		}
		return 0;

	}

}
