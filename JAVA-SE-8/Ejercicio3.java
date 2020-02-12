package ejercicio3;
import java.util.Arrays;
import java.util.Comparator;
public class Robots {
    private int[][] robots;
    private int serial=0;
    public Robots(){
    	super();
    	robots = new int[( 5 + (int)(Math.random() * ((10 - 5) + 1)))][2];
    	for (int row = 0; row < robots.length; row++) { 
    		for (int col = 0; col < robots[row].length; col++) { 
    			if(col == 0) {
    				robots[row][col] = serial+1;
    				serial++;
    			}
    			else {
    				robots[row][col] = 1 + (int)(Math.random() * ((100 - 1) + 1));
    			}
    		} 
    	}
    } 
    public void robotsOrdenados() {
    	Arrays.sort(robots, Comparator.comparingInt(arr -> arr[1]));
    	System.out.println("-------ORDENADOS DE MENOR A MAYOR % DE VIDA------");
    	for (final int[] s : robots) {
            System.out.println("ROBOT SERIE "+s[0] + "° PORCENTAJE DE VIDA RESTANTE:  " + s[1]+"%");
        }
        System.out.println("------------------------------------------------- \n");
    }
    public void robotsMayores50() {
    	System.out.println("-----------MAYORES A 50% de VIDA-----------------");
    	for (final int[] s : robots) {
    		if(s[1]>50) {
    			System.out.println("ROBOT SERIE "+s[0] + "° PORCENTAJE DE VIDA RESTANTE:  " + s[1]+"%");
    		}
    	}
    	System.out.println("------------------------------------------------- \n");
    }
    public void robotsTresMayores() {
    	System.out.println("------TRES ROBOTS CON MAYOR % DE VIDA------------");
    	for (int i=robots.length-1; i > (robots.length-4);i--) {
    		System.out.println("ROBOT SERIE "+robots[i][0] + "° PORCENTAJE DE VIDA RESTANTE:  " + robots[i][1]+"%");
    	}
    	System.out.println("------------------------------------------------- \n");
    }
    public static void main(String[] args) {
        Robots lista = new Robots();
        lista.robotsOrdenados();
        lista.robotsMayores50();
        lista.robotsTresMayores();
    }
}