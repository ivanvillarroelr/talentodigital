package Negocio;

import java.util.*;
import java.util.Map.Entry;

public class Reservar{
	
	Scanner leer = new Scanner(System.in);
	
	private HashMap<String,String[]> reservaCompra;	
	ConsultaVuelo vuelo;
	/*
	 * Ejemplo de entry.getKey() 
	 * > NOMBRE_DE_USUARIO
	 * Ejemplo de entry.getValue()
	 * >{{CODIGO_VUELO,ESTADO(R/C)},{CODIGO_VUELO,ESTADO(R/C)},{CODIGO_VUELO,ESTADO(R/C)}}
	 */
	
	public Reservar(ConsultaVuelo vuelo) {
		super();
		this.vuelo = vuelo;
		reservaCompra = new HashMap<String,String[]>();

	}
	
	public String setReserva(ConsultaVuelo vuelo, String usuario) {
		String mensaje;
		System.out.println("> Ingrese código de vuelo: ");
		int codigoVuelo = leer.nextInt();
		String[] aux = vuelo.reporteVuelo(codigoVuelo);
		int asientosAux = Integer.parseInt(aux[0]);
		System.out.println(asientosAux);
		if(asientosAux>0) {
			if(vuelo.disminuirAsientos(codigoVuelo)) {
				String[] reserva = {String.valueOf(codigoVuelo),"R"};
				this.reservaCompra.put(usuario,reserva);
				mensaje = ("Mensaje: El vuelo "+aux[1]+" identificador de vuelo "
						+codigoVuelo+" ha sido reservado exitosamente");
			}
			else {
				mensaje = "Mensaje: No quedan asientos disponibles en este vuelo! IN";
			}

		}
		else {
			mensaje = ("Mensaje: No quedan asientos disponibles en ese vuelo! OUT");
		}
		return mensaje;
	}
	
	public String setCompra(ConsultaVuelo vuelo, String usuario) {
		String mensaje = "Ha ocurrido un error";
		System.out.println("> Ingrese código de vuelo: ");
		String codigoVuelo = leer.nextLine();
		for(Entry<String,String[]> entry: reservaCompra.entrySet()) {
			String[] aux = entry.getValue();
			if(usuario.equals(entry.getKey())){ 
				if(codigoVuelo.equals(aux[0])){
					String[] reemplaza = {aux[1],"C"};
					reservaCompra.replace(usuario,reemplaza);
					mensaje = ("Mensaje: Su compra fue procesada exitosamente");
				}
				else {
					if(Integer.parseInt(aux[0])>0) {
						String[] reserva = {codigoVuelo,"C"};
						this.reservaCompra.put(usuario,reserva);
						mensaje = ("Mensaje: Su compra fue procesada exitosamente");
					}
					else {
						mensaje = ("Mensaje: No quedan asientos disponibles en ese vuelo!");
						}
					}
				}
		}
		return mensaje;
	}
	
	public void mostrarReservas(String usuario) {
		System.out.printf("%-30s %-30s %-30s\n","NOMBRE DE USUARIO","CODIGO DE RESERVA", "ESTADO");
		System.out.printf("%-300s\n","_________________________________________________________________________");
		for (Entry<String,String[]> entry: this.reservaCompra.entrySet()) {
			if(usuario.equals(entry.getKey())){
				String[] aux = entry.getValue();
				String codigo = aux[0], estado = aux[1];
				System.out.printf("%-30s %-30s %-30s\n",usuario, codigo, estado);
				System.out.printf("%-300s\n","_________________________________________________________________________");
			}
		}
	}
	
	
	
	
}
