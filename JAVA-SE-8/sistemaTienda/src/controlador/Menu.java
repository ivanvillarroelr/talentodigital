package controlador;

import java.util.Scanner;

import modelo.Conexion;

public class Menu {
	
	Conexion conn = new Conexion();
	
	Scanner leer = new Scanner (System.in);
	
	public int menuPrincipal() {
		int eleccion;
		System.out.println("____________________________________________________ \n \n"
		+"Menú: \n"
		+"1.Login \n"
		+"2.Salir \n"
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
	
	public void logInUsuario() {
		System.out.println("Ingrese nombre de usuario: ");
		String nombre = leer.nextLine();
		System.out.println("Ingrese password: ");
		String pass = leer.nextLine();
		Usuarios usuario = new Usuarios(nombre, pass);
		if(conn.consultarUser(usuario.getUsuario(),usuario.getContrasena())) {
			System.out.println(" ");
			System.out.println(">Ingreso validado correctamente. ");
			casesSubMenu(subMenu());
		}
		else {
			System.out.println("Contraseña inválida");
		}
	}
	
	private int subMenu() {
		int eleccion;
		System.out.println("____________________________________________________ \n \n"
		+"Menú: \n"
		+"1.Ver objetos tienda \n"
		+"2.Añadir un objeto al carrito \n"
		+"3.Pagar el carrito\n"
		+"_____________________________________________________ \n \n"
		+"> Ingrese su opcion:  "
		);
		while(true) {
			String aux = leer.next();
			try {
				eleccion = Integer.parseInt(aux);
				if(eleccion>4 | eleccion<1) {
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
	
	private void casesSubMenu(int eleccion) {
		switch(eleccion) {
		
		case 1: conn.displayProductos();
				casesSubMenu(subMenu());
		
		case 2: //comprarProducto();
				break;
		
		case 3: //pagarCarrito();
				break;
		
		case 4: //volverMenuPrincipal();
		}
	}

	public void casesMenuPrincipal(int eleccion) {
		switch(eleccion) {
		
		case 1: logInUsuario();
				break;
		
		case 2: System.exit(0);
		}
	}
}
