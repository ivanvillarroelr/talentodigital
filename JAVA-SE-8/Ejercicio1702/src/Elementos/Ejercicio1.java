package Elementos;

public class Ejercicio1 {
	int num1, num2, num3;
	double resultado;
	public Ejercicio1(int num1, int num2, int num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.resultado = (num1+num2+num3)/3;
	}
	public double getResultado() {
		return resultado;
	}
}
