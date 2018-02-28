package Capitulo_5.ProgrammingExercises.E7;

public class DigitalCamera {

	String marca;
	int megapixel;
	int precio;

	public DigitalCamera(String marca, int megapixel) {
		this.marca = marca;
		this.megapixel = megapixel;
		this.precio = precio;

		if (megapixel == 10) {
			this.precio = 10;
		}
		if (megapixel <= 6) {
			this.precio = 99;
		}
		if (megapixel > 6 && megapixel < 10) {
			this.precio = 129;
		}
	}

	public void mostrar_los_resultados() {

		System.out.println("La Marca es: " + marca);
		System.out.println("Los Megapixeles son: " + megapixel);
		System.out.println("El Precio es de: " + precio);
	}

}
