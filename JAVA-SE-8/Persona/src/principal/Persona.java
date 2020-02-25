package principal;

public class Persona {
	
	/*
	 * AQUI VAN LOS CAMPOS (FIELDS) / ATRIBUTOS 
	 */
	
	private String rut,nombre;
	private int edad,peso;
	private double altura;
	private char sexo;

	/*
	 * AQUI VAN LOS CONSTRUCTORES
	 */

	public Persona() {
		super();
		this.altura = 1;
	}

	public Persona(String rut, String nombre, int edad, char sexo) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = 1;
		this.peso = 1;
	}

	public Persona(String rut, String nombre, int edad, int peso, double altura, char sexo) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}

/*
 *  AQUI VAN A IR LOS METODOS IMPLEMENTADOS 
 */
	
	
	public int determinarIMC() {
		double imc = (this.peso/((this.altura/100)*(this.altura/100)));
		int valor = -2;
		if(imc<20) {
			valor = -1;
		}
		else if(imc>20 & imc<=25) {
			valor = 0;
		}
		else if(imc>25) {
			valor = 1;
		}
		return  valor;
	}
	
	public boolean esMayorDeEdad() {
		if (this.edad >=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void comprobarSexo() {
		if(this.sexo=='M' | this.sexo=='m') {
		}
		else if(this.sexo=='H' | this.sexo=='h') {
		}
		else {
			this.sexo = 'H';
		}
	}
	
	public String toString() {
		String valor = ("Rut: "+this.rut+"\n"
				+"Nombre: "+this.nombre+"\n"
				+"Edad: "+this.edad+"\n"
				+"Sexo: "+this.sexo+"\n"
				+"Peso: "+this.peso+"\n"
				+"Altura: "+this.altura+"\n"
				);
		return valor;
	}
	
	public static boolean validarRUT(String rut) {
		boolean validacion = false;
		try {
		rut =  rut.toUpperCase();
		rut = rut.replace(".", "");
		rut = rut.replace("-", "");
		int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
		char dv = rut.charAt(rut.length() - 1);
		int m = 0, s = 1;
		for (; rutAux != 0; rutAux /= 10) {
		s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
		}
		if (dv == (char) (s != 0 ? s + 47 : 75)) {
		validacion = true;
		}
		} catch (java.lang.NumberFormatException e) {
		} catch (Exception e) {
		}
		return validacion;
	}
	
	
/* 
 *  AQUI IRAN LOS GETTERS Y SETTERS
 */
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
