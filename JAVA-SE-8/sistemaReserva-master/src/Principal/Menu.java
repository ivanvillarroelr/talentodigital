package Principal;

import java.util.*;

import Negocio.ConsultaVuelo;
import Negocio.Reservar;
import Negocio.Usuarios;

public class Menu {
	Reservar reservaCompra;
	Scanner leer = new Scanner(System.in);
	Usuarios UsuarioAux;

	
	public Menu(ConsultaVuelo vuelo) {
		super();
		reservaCompra = new Reservar(vuelo);
	}
	
	public int menuPrincipal() {
		int eleccion;
		System.out.println("____________________________________________________ \n \n"
		+"Menú: \n"
		+"1.Crear usuario \n"
		+"2.Login \n"
		+"3.Salir \n"
		+"_____________________________________________________ \n \n"
		+"> Ingrese su opcion:  "
		);
		while(true) {
			String aux = leer.next();
			try {
				eleccion = Integer.parseInt(aux);
				if(eleccion>3 | eleccion<1) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.out.println("Ingrese una opción válida. ");
			}
		}
		leer.nextLine();
		return eleccion;
	}
	
	public int subMenu() {
		int eleccion;
		System.out.println("____________________________________________________ \n \n"
		+"Sub Menu: \n"
		+"1.Cotizar Vuelos \n"
		+"2.Reservar vuelo por código \n"
		+"3.Confirmar compra de vuelo por código \n"
		+"4.Mostrar resumen de vuelos comprados/reservados \n"
		+"5.Volver \n"
		+"_____________________________________________________ \n \n"
		+"> Ingrese su opcion:  "
		);
		while(true) {
			String aux = leer.next();
			try {
				eleccion = Integer.parseInt(aux);
				if(eleccion>5 | eleccion<1) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.out.println("Ingrese una opción válida. ");
			}
		}
		leer.nextLine();
		return eleccion;
	}
	
	public void registroUsuario(Usuarios usuario, ConsultaVuelo vuelo) {
		System.out.println("> Ingrese nombre de usuario: ");
		String nombre = leer.nextLine();
		System.out.println("> Ingrese password: ");
		String password = leer.nextLine();
		usuario.setLogin(nombre, password);
		System.out.println("Desea continuar? S/N");
		if(leer.nextLine().toLowerCase().equals("n")){
			System.out.println("ADIOS!");
			System.exit(0);
		}
		else {
			menuElecciones(menuPrincipal(),usuario, vuelo);
		}
	}
	
	public void logginUsuario(Usuarios usuario, ConsultaVuelo vuelo) {
		this.UsuarioAux = usuario;
		System.out.println("> Ingrese su usuario: ");
		String usuarioAux = leer.nextLine();
		System.out.println("> Ingrese su password: ");
		String passwordAux = leer.nextLine();
		if(usuario.getPassword(usuarioAux,passwordAux)) {
			System.out.println("> Ingreso correcto, password aceptada");
			int respuesta = subMenu();
			subMenuLoggedOn(respuesta,usuarioAux, vuelo);
		}
		else {
			System.out.println("> Ingreso incorrecto, password errónea");
		}
		System.out.println("Desea continuar? S/N");
		if(leer.nextLine().toLowerCase().equals("n")){
			System.out.println("ADIOS!");
			System.exit(0);
		}
		else {
			menuElecciones(menuPrincipal(),usuario,vuelo);
		}
	}
	
	public void salirSistema() {
		
		System.out.println("ADIOS!");
		System.exit(0);
		
	}
	
	public void menuElecciones(int eleccion,Usuarios usuario, ConsultaVuelo vuelo) {
		
		switch(eleccion) {
		
		case 1: 
				registroUsuario(usuario,vuelo);
		
		case 2: 
				logginUsuario(usuario,vuelo);
				
		case 3: 
				salirSistema();
		}
	}
	
	public void subMenuLoggedOn(int eleccion, String user, ConsultaVuelo vuelo) {
		switch(eleccion) {
		
		case 1: vuelo.mostrarVuelos();
				System.out.println("Desea continuar? S/N");
					if(leer.nextLine().toLowerCase().equals("n")){
						System.out.println("ADIOS!");
						System.exit(0);
					}
					else {
						int respuesta = subMenu();
						subMenuLoggedOn(respuesta,user, vuelo);
					}
				// Cotizar vuelos
				/*
				 * Se utilizará un método de la clase ConsultaVuelo para mostrar todos los vuelos ordenados 
				 * por una sub elección: 1) Horario de vuelo, 2) Tarifa de vuelo, 3) Información de vuelo(?)
				 * 
				 */
		
		case 2: 
				
				System.out.println(reservaCompra.setReserva(vuelo,user));
				System.out.println("Desea continuar? S/N");
				if(leer.nextLine().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					int respuesta = subMenu();
					subMenuLoggedOn(respuesta,user, vuelo);
				}
				// Reservar vuelos
				/*
				 * Se utilizará el método ConsultaVuelo.reporteVuelo() que al entregar el String ID del vuelo
				 * devuelve un String[] con la información completa de ese vuelo particular para su reserva. 
				 * La lógica interna de la clase debe realizar una persistencia de datos asociada a: 1) El usuario de la sesión,
				 * 2)la cantidad de vuelos disponibles(descontar 1 vuelo del total), 3)El estado del vuelo (Reservado/Comprado)
				 */
			
		case 3: 
				
				// Comprar vuelos
			
		case 4: reservaCompra.mostrarReservas(user);
				System.out.println("Desea continuar? S/N");
				if(leer.nextLine().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					int respuesta = subMenu();
					subMenuLoggedOn(respuesta,user, vuelo);
				}
				// Mostrar reservas y compras del usuario 
				/*
				 * Permite consultar la persistencia de reservaVuelos y cambiar el estado (Reservado a Comprado) por usuario
				 * 
				 */
			
		case 5: 
				menuElecciones(menuPrincipal(),UsuarioAux, vuelo);
				// Volver al menu principal 
		
		}
		
	}
}
