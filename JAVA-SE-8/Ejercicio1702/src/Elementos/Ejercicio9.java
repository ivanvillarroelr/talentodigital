package Elementos;

import java.util.Arrays;
import java.util.List;

public class Ejercicio9 {
	List<String[]> agenda; 
	
	public Ejercicio9(List<String[]> agenda) {
		this.agenda = agenda;
	}
	
	public void mostrarElementos() {
		System.out.println("> Imprimiendo información de agenda...");
		for (String[] row : this.agenda) {
		    System.out.println(Arrays.toString(row));
		}
	}
}
