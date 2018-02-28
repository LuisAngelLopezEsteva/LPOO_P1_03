package Capitulo_8.ProgrammingExercises.E6;

public class DemoSalesperson2 {

	public static void main(String[] args) {

		Salesperson2[] s = new Salesperson2[10];
		Integer nu = 111;
		double ven = 25000.0;
		for (int i = 0; i < 10; i++) {
			s[i] = new Salesperson2(nu, ven);
			nu = nu + 1;
			ven = ven + 5000.0;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("vendedor " + (i + 1) + ": " + s[i].getNoIdentificacion() + "   " + s[i].getVentas());
		}
	}

}

class Salesperson2 {
    private Integer noidentificacion;
    private double ventas;
    
    public Salesperson2(Integer noi, double ventas){
        this.noidentificacion = noi;
        this.ventas = ventas;
    }
    
    public void setNoIdentificacion(Integer noi){
        this.noidentificacion = noi;
    }
    
    public void setVentas(double ventas){
        this.ventas = ventas;
    }
    
    public Integer getNoIdentificacion(){
        return this.noidentificacion;
    }
    
    public double getVentas(){
        return this.ventas;
    }
}
