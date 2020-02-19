package Elementos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
	List<Integer> numeros = new ArrayList<Integer>();
	public Ejercicio5(List<Integer> numeros) {
		this.numeros = numeros;
	}
	public void getNumeros() {
		System.out.println("Se imprimirán los números ingresados: ");
		for(Integer s: this.numeros) {
			System.out.println("> "+s);
		}
	}
}
