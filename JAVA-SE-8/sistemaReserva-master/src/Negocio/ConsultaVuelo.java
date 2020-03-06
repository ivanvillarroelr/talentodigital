package Negocio;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ConsultaVuelo {
	
	HashMap <Integer,String[]> vuelo; 
	
	public ConsultaVuelo ()
		{
		String[] auxEjemplo  = {"0 - CANTIDAD DE ASIENTOS DISPONIBLES",
							    "1 - NOMBRE VUELO",
							    "2 - FECHA VUELO",
							    "3 - HORA VUELO",
							    "4 - CIUDAD ORIGEN",
							    "5 - CIUDAD DESTINO"};
		
		// SE DECLARAN VUELOS 
		
		String[] auxVuelo1 = {"60","SANTIAGO/SERENA","20-02-2020","15:30","Santiago","La Serena"};
		String[] auxVuelo2 = {"60","SANTIAGO/CONCEPCION","20-02-2020","16:30","Santiago","Concepcion"};
		String[] auxVuelo3 = {"60","SANTIAGO/PUNTA ARENAS","20-02-2020","17:30","Santiago","Punta Arenas"};
		
		// SE INICIALIZA VARIABLE VUELO (DICCIONARIO DE VUELOS) 
		
		this.vuelo = new HashMap<Integer, String[]>();
		
		// SE PUEBLA EL DICCIONARIO 
		
		vuelo.put(1, auxVuelo1);
		vuelo.put(2, auxVuelo2);
		vuelo.put(3, auxVuelo3);
	
		}
	
	public String[] reporteVuelo(int id)
	{	
		String[] aux= {};
		for (Entry<Integer, String[]> entry: this.vuelo.entrySet()) 
		{
			if (id==entry.getKey())	
			{
		
				aux=entry.getValue();
	
			}
		}
		return aux;
	}
	public void mostrarVuelos() {
		System.out.printf("%-15s %-25s %-30s %-15s %-15s %-15s %-15s\n","CODIGO DE VUELO", "ASIENTOS DISPONIBLES", "NOMBRE VUELO", "FECHA VUELO", "HORA VUELO", "CIUDAD ORIGEN", "CIUDAD DESTINO");
		System.out.printf("%-300s\n","_________________________________________________________________________________________________________________________________________________________________________________________________________");
		for (Entry<Integer,String[]> entry: this.vuelo.entrySet()) {
			String[] aux = entry.getValue();
			String asientosDisponibles = aux[0], nombreVuelo = aux[1], fechaVuelo = aux[2];
			String horaVuelo = aux[3], ciudadOrigen = aux[4], ciudadDestino = aux[5];
			System.out.printf("%-15s %-25s %-30s %-15s %-15s %-15s %-15s\n",entry.getKey(), asientosDisponibles, nombreVuelo, fechaVuelo, horaVuelo, ciudadOrigen, ciudadDestino);
			System.out.printf("%-300s\n","_________________________________________________________________________________________________________________________________________________________________________________________________________");
		}
	}
	
	public boolean disminuirAsientos(int codigoVuelo) {
		boolean respuesta=false;
		for(Entry<Integer,String[]> entry : this.vuelo.entrySet()) {
			if(codigoVuelo==entry.getKey()) {
				if(Integer.parseInt(entry.getValue()[0])>0) {
					String[] aux = entry.getValue();
					String asientos = aux[0], nombre = aux[1], fecha = aux[2];
					String hora = aux[3], origen = aux[4], destino = aux[5];
					int asientosNuevos = Integer.parseInt(asientos) -1;
					String[] nuevosDatos = {Integer.toString(asientosNuevos),nombre,fecha,hora,origen,destino};
					this.vuelo.replace(codigoVuelo,nuevosDatos);
					respuesta = true;
				}
				else {
					respuesta = false;
					
				}
			}
			//Según Analisis y trace realizado, se encuentra problema con el segundo else. Se corrige, comentando el código indicado, con lo cual se pueden realizar correctamente la reserva de vuelo, con disminución de asientos.
			/*
			else {
				respuesta=false;
				 
			} */
		}
		return respuesta; 
	}
}
