package Elementos;

public class Ejercicio8 {
	String[] nombres;
	public Ejercicio8(String[] nombres) {
		this.nombres = nombres;
	}
	public void imprimir5() {
		System.out.println("> Se imprimiran máx. 5 nombres por línea...");
	    for (int i = 0; i < nombres.length; i++) {
	        if (i % 5 == 0 && i > 0) {
	            System.out.println();
	        }
	        System.out.print("\""+nombres[i]+"\"" + " ");
	    }
	}
}
