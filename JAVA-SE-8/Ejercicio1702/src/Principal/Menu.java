package Principal;
import java.util.*;
import Elementos.Ejercicio1;
import Elementos.Ejercicio2;
import Elementos.Ejercicio4;
import Elementos.Ejercicio5;
import Elementos.Ejercicio6;
import Elementos.Ejercicio7;
import Elementos.Ejercicio8;
import Elementos.Ejercicio9;

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
				System.out.println("Ingrese N números. Se detendrá el proceso al ingresar 0");
				List<Integer> arregloAuxiliar = new ArrayList<Integer>();
				while(true) {
					String aux = leer.next();
					try {
						numero = Integer.parseInt(aux);
						if(numero==0) {
							break;
						}
						arregloAuxiliar.add(numero);
					}
					catch(Exception e) {
						System.out.println("Ingrese una opción válida. ");
					}
				}
				Ejercicio5 holder5 = new Ejercicio5(arregloAuxiliar);
				holder5.getNumeros();
				System.out.println(">Desea continuar? S/N");
				if(leer.next().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 6: 
				System.out.println("Ingrese N nombres con J, ganará si acierta al que tengo en mente.");
				while(true) {
					String aux = leer.next();
					try {
						if(String.valueOf(aux.charAt(0)).toLowerCase().equals("j")) {
							Ejercicio6 holder6 = new Ejercicio6(aux);
							if(holder6.getNombre()) {
								System.out.println("Has acertado! el nombre era Juan. ");
								break;
							}
							else {
								throw new Exception();
							}
						}
						else {
							System.out.println("Recuerda, nombres con J...");
							throw new Exception();
						}
					}
					catch(Exception e) {
						System.out.println("Inténtalo nuevamente... ");
					}
				}
				System.out.println(">Desea continuar? S/N");
				if(leer.next().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 7:
				ArrayList<String> auxList = new ArrayList<String>();
				System.out.println("> Ingrese 10 nombres.");
	        	for(int i=0;i<10;i++){
	        		System.out.println((i+1)+": ");
	        		auxList.add(leer.next().toLowerCase());
	        	}
	        	Ejercicio7 holder7 = new Ejercicio7(auxList);
	        	holder7.getFrequency();
	        	System.out.println(">Desea continuar? S/N");
				if(leer.next().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 8: 
				System.out.println(">I ngrese tamaño del arreglo: ");
				String[] nombres = new String[leer.nextInt()];
				leer.nextLine();
				System.out.println("> Ingrese nombres de Full Stack's: ");
				for(int i=0;i<nombres.length;i++) {
					System.out.println((i+1)+": ");
					nombres[i] = leer.nextLine();
				}
				Ejercicio8 holder8 = new Ejercicio8(nombres);
				holder8.imprimir5();
				System.out.println(">Desea continuar? S/N");
				if(leer.next().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 9:
			    List<String[]> agenda = new ArrayList<String[]>();
			    while(true) {
			    	System.out.println("> Ingrese nombre: ");
			    	String nombreAgenda = leer.nextLine();
			    	System.out.println("> Ingrese apellido: ");
			    	String apellidoAgenda = leer.nextLine();
			    	System.out.println("> Ingrese teléfono: ");
			    	int telefonoAgendaAux;
			    	while(true) {
						String aux = leer.nextLine();
						try {
							telefonoAgendaAux = Integer.parseInt(aux);
							break;
						}
						catch(Exception e) {
							System.out.println("Ingrese una teléfono válido. ");
						}
					}
			    	String telefonoAgenda = Integer.toString(telefonoAgendaAux);
			    	System.out.println("> Ingrese email: ");
			    	String emailAgenda;
			    	while(true) {
						String aux = leer.nextLine();
						try {
							if(aux.contains("@") & aux.contains(".")) {
								emailAgenda = aux;
								break;
							}
							else {
								throw new Exception();
							}
						}
						catch(Exception e) {
							System.out.println("Ingrese un email válido. ");
						}
					}
			    	agenda.add(new String[] { nombreAgenda, apellidoAgenda, (String)telefonoAgenda, emailAgenda });
			    	System.out.println(">Desea continuar? S/N");
					if(leer.nextLine().toLowerCase().equals("n")){
						break;
					}
					else {
						continue;
					}
			    }
			    Ejercicio9 holder9 = new Ejercicio9(agenda);
			    holder9.mostrarElementos();
			    System.out.println(">Desea continuar? S/N");
				if(leer.nextLine().toLowerCase().equals("n")){
					System.out.println("ADIOS!");
					System.exit(0);
				}
				else {
					menuElecciones(menuPrincipal());
					break;
				}
		case 10:
				System.out.println("ADIOS!");
				System.exit(0);
		}
	}
}
