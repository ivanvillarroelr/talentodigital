package Elementos;

public class Ejercicio6 {
	String nombre;
	public Ejercicio6() {
		super();
	}
	public Ejercicio6(String nombre) {
		this.nombre=nombre;
	}
	public boolean getNombre() {
		if(nombre.toLowerCase().equals("juan")) {
			return true;
		}
		else {
			return false;
		}
	}
}
