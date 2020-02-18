package Elementos;

public class Ejercicio2 {
	String nombre;
	String genero;
	String bano; 
	int precio;
	boolean ducha;
	public Ejercicio2(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
		if(genero.toLowerCase().equals("masculino")) {
			this.bano = "VARONES";
		}
		else if(genero.toLowerCase().equals("femenino")) {
			this.bano = "DAMAS";
		}
		else {
			this.bano = "INCLUSIVO";
		}
	}
	public String getBano() {
		return bano;
	}
	public void setDucha(String consulta) {
		if(consulta.toLowerCase().equals("s")){
			this.precio = 2500;
		}
		else if(consulta.toLowerCase().equals("n")) {
			this.precio = 250;
		}
	}
	public int getPrecio() {
		return precio;
	}
}
