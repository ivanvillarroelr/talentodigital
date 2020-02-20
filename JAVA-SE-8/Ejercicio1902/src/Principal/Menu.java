package Principal;

import java.util.*;
import Negocio.Usuarios;

public class Menu {
	
	Usuarios usuario = new Usuarios();
	Scanner leer = new Scanner(System.in);
	
	public Menu() {
		super();
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
		Scanner leer = new Scanner(System.in);
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
		return eleccion;
	}
	
	public void casoUno() {
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
			menuElecciones(menuPrincipal());
		}
	}
	
	public void casoDos() {
		System.out.println("> Ingrese su usuario: ");
		String usuarioAux = leer.nextLine();
		System.out.println("> Ingrese su password: ");
		String passwordAux = leer.nextLine();
		if(usuario.getPassword(usuarioAux,passwordAux)) {
			System.out.println("> Ingreso correcto, password aceptada");
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
			menuElecciones(menuPrincipal());
		}
	}
	
	public void casoTres() {
		
		System.out.println("ADIOS!");
		System.exit(0);
		
	}
	
	public void menuElecciones(int eleccion) {
		Usuarios usuario = new Usuarios();
		Scanner leer = new Scanner(System.in);
		switch(eleccion) {
		
		case 1: 
				casoUno();
		
		case 2: 
				casoDos();
				
		case 3: 
				casoTres();
		}
	}
}
