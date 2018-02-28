package Capitulo_5.ProgrammingExercises.E8;

public class Park {

	String nombre;
	int tamanio;
	boolean picnic;
	boolean tenis;
	boolean infantil;
	boolean piscina;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanio() {

		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;

		if (tamanio < 0 && tamanio > 400) {
			System.out.println("no se admiten valores negativos ni valores mayores a 400");
		}

	}

	public boolean isPicnic() {
		return picnic;
	}

	public void setPicnic(boolean picnic) {
		this.picnic = picnic;
	}

	public boolean isTenis() {
		return tenis;
	}

	public void setTenis(boolean tenis) {
		this.tenis = tenis;
	}

	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public void uno(String nombre, boolean picnic, boolean infantil) {

		this.infantil = infantil;
		this.picnic = picnic;
		this.nombre = nombre;

	}

}
