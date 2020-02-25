package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String rut, nombre;
		int edad, peso, altura;
		char sexo;
		
		// Solicitud de información para rellenar objetos
		System.out.println("> Ingrese su rut: ");
		while(true) {
			rut = sc.nextLine();
			boolean respuesta = Persona.validarRUT(rut);
			if(respuesta) {
				System.out.println("> Rut validado correctamente. ");
				break;
			}
			else {
				System.out.println("> Por favor ingresa un rut válido. ");
			}
		}
		
		System.out.println("> Ingrese su nombre: ");
		nombre = sc.nextLine();
		System.out.println("> Ingrese su edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.println("> Ingrese su sexo: ");
		System.out.println("EJEMPLO: H para masculino y M para femenino. ");
		sexo = sc.nextLine().charAt(0);
		System.out.println("> Ingrese su peso: ");
		peso = sc.nextInt();
		System.out.println("> Ingrese su altura en cm.: ");
		altura = sc.nextInt();
		System.out.println(" ");
		
		// Crea 3 objetos de la clase persona 
		Persona persona1 = new Persona(rut, nombre, edad, peso, altura, sexo);
		Persona persona2 = new Persona(rut, nombre, edad, sexo);
		Persona persona3 = new Persona();
		persona3.setRut(rut);
		persona3.setNombre(nombre);
		persona3.setEdad(edad);
		persona3.setPeso(peso);
		persona3.setAltura(altura);
		persona3.setSexo(sexo);
		
		// Comprobar si esta en peso ideal, tiene sobre peso o bajo peso para cada objeto 
		
		switch(persona1.determinarIMC()) {
		case -1: 
				System.out.println("> Persona 1 se encuentra bajo peso. \n");
				break;
		case  0:
				System.out.println("> Persona 1 se encuentra en peso ideal. \n");
				break;
	
		case  1:
				System.out.println("> Persona 1 se encuentra sobre peso. \n");
				break;
	
		}
		switch(persona2.determinarIMC()) {
		case -1: 
				System.out.println("> Persona 2 se encuentra bajo peso. \n");
				break;
		case  0:
				System.out.println("> Persona 2 se encuentra en peso ideal. \n");
				break;
	
		case  1:
				System.out.println("> Persona 2 se encuentra sobre peso. \n");
				break;
	
		}
		switch(persona3.determinarIMC()) {
		case -1: 
				System.out.println("> Persona 3 se encuentra bajo peso. \n");
				break;
		case  0:
				System.out.println("> Persona 3 se encuentra en peso ideal. \n");
				break;
	
		case  1:
				System.out.println("> Persona 3 se encuentra sobre peso. \n");
				break;
	
		}
		// Indicar para cada objeto si es mayor de edad
		
		if(persona1.esMayorDeEdad()) {
			System.out.println("> Persona 1 es mayor de edad. \n");
		}
		else {
			System.out.println("> Persona 1 es menor de edad. \n");
		}
		
		if(persona2.esMayorDeEdad()) {
			System.out.println("> Persona 2 es mayor de edad. \n");
		}
		else {
			System.out.println("> Persona 2 es menor de edad. \n");
		}
		
		if(persona3.esMayorDeEdad()) {
			System.out.println("> Persona 3 es mayor de edad. \n");
		}
		else {
			System.out.println("> Persona 3 es menor de edad. \n");
		}
		
		// Mostrar la información de cada objeto
		System.out.println("> Información para persona 1: ");
		System.out.println(persona1.toString());
		System.out.println("> Información para persona 2: ");
		System.out.println(persona2.toString());
		System.out.println("> Información para persona 3: ");
		System.out.println(persona3.toString());

	}
}
