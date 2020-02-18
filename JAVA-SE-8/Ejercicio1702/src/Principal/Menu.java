package Principal;
import java.util.Scanner;
import Elementos.Ejercicio1;
import Elementos.Ejercicio2;
import Elementos.Ejercicio4;

public class Menu {
	public Menu() {
		super();
	}
	public int menuPrincipal() {
		int eleccion;
		System.out.println("____________________________________________________ \n \n"
		+"Menú: \n"
		+"1.Secuencial: \n"
		+"2.Condicional Si entonces: \n"
		+"3.Condicional Si entonces anidado: \n"
		+"4.Condicional según: \n"
		+"5.Repetitiva Mientras \n"
		+"6.Repetitiva Repetir \n"
		+"7.repetitiva Para \n"
		+"8.Arreglo Simple \n"
		+"9.Arreglo Bidimensional \n"
		+"10.Salir \n"
		+"______________________________________________________ \n \n"
		+"> Ingrese su opcion:  "
		);
		Scanner leer = new Scanner(System.in);
		while(true) {
			String aux = leer.next();
			try {
				eleccion = Integer.parseInt(aux);
				if(eleccion>10 | eleccion<1) {
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
	public void menuElecciones(int eleccion) {
		Scanner leer = new Scanner(System.in);
		switch(eleccion) {
		case 1: 
				System.out.println("Ingresará 3 números: \n >Ingrese el primer número: ");
				int num1;
				while(true) {
					String aux = leer.next();
					try {
						num1 = Integer.parseInt(aux);
						break;
					}
					catch(Exception e) {
						System.out.println("Ingrese una opción válida. ");
					}
				}
				System.out.println(">Ingrese el segundo número: ");
				int num2;
				while(true) {
					String aux = leer.next();
					try {
						num2 = Integer.parseInt(aux);
						break;
					}
					catch(Exception e) {
						System.out.println("Ingrese una opción válida. ");
					}
				}
				System.out.println(">Ingrese el tercer número: ");
				int num3;
				while(true) {
					String aux = leer.next();
					try {
						num3 = Integer.parseInt(aux);
						break;
					}
					catch(Exception e) {
						System.out.println("Ingrese una opción válida. ");
					}
				}			
				Ejercicio1 holder1 = new Ejercicio1(num1, num2, num3);
				System.out.println("El promedio es: "+holder1.getResultado());
				System.out.println("Desea continuar? S/N");
				if(leer.next().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 2:
				System.out.println("Ingrese nombre: ");
				String nombre = leer.nextLine();
				System.out.println("Ingrese genero");
				String genero = leer.nextLine();
				Ejercicio2 holder2 = new Ejercicio2(nombre, genero.toLowerCase());
				System.out.println("El baño que le corresponde es: "+holder2.getBano());
				System.out.println("Desea continuar? S/N");
				if(leer.next().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 3:
				System.out.println(">Ingrese nombre: ");
				String nombre2 = leer.nextLine();
				System.out.println(">Ingrese genero");
				String genero2 = leer.nextLine();
				Ejercicio2 holder3 = new Ejercicio2(nombre2, genero2.toLowerCase());
				System.out.println("El baño que le corresponde es: "+holder3.getBano());
				System.out.println(">Desea usar ducha? S/N");
				while(true) {
					String aux = leer.next();
					if(aux.toLowerCase().equals("s")) {
						holder3.setDucha(aux);
						break;
					}
					else if(aux.toLowerCase().equals("n")) {
						holder3.setDucha(aux);
						break;
					}
					else {
						System.out.println(">Ingrese una opción válida: ");
					}
				}
				System.out.println("A usted le corresponde pagar: "+holder3.getPrecio());
				System.out.println(">Desea continuar? S/N");
				if(leer.next().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 4:
				System.out.println("Ingrese número del 1 al 10 y obtendrá su nombre: ");
				int numero;
				while(true) {
					String aux = leer.next();
					try {
						numero = Integer.parseInt(aux);
						if(numero>10 | numero<1) {
							throw new Exception();
						}
						break;
					}
					catch(Exception e) {
						System.out.println("Ingrese una opción válida. ");
					}
				}
				Ejercicio4 holder4 = new Ejercicio4(numero);
				System.out.println("El número es: "+holder4.getRespuesta());
				System.out.println(">Desea continuar? S/N");
				if(leer.next().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 5:
				break;
		case 6:
				break;
		case 7:
				break;
		case 8:
				break;
		case 9:
				break;
		case 10:
				System.out.println("ADIOS!");
				System.exit(0);
		}
	}
}
