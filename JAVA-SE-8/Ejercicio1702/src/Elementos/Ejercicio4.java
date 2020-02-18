package Elementos;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
	int numero;
	String respuesta;
	public Ejercicio4(int numero) {
		this.numero = numero;
		HashMap<Integer,String> diccionario = new HashMap<Integer, String>();
		diccionario.put(1,"UNO");
		diccionario.put(2,"DOS");  
		diccionario.put(3,"TRES");
		diccionario.put(4,"CUATRO");
		diccionario.put(5,"CINCO");
		diccionario.put(6,"SEIS");
		diccionario.put(7,"SIETE");
		diccionario.put(8,"OCHO");
		diccionario.put(9,"NUEVE");
		diccionario.put(10,"DIEZ");
		for (Map.Entry<Integer, String> entry : diccionario.entrySet()) {
			if(numero==entry.getKey()) {
				this.respuesta=entry.getValue();
			}
		}
	}
	public String getRespuesta() {
		return this.respuesta;
	}
}
