package Elementos;
import java.util.*;

public class Ejercicio7 {
        boolean comprobar;
        ArrayList<String> nombres = new ArrayList<String>();
        Set<String> aux; 
        public Ejercicio7() {
        	super();
        	this.comprobar = false;
        }
        
        public Ejercicio7(ArrayList<String> nombres) {
        	this.nombres = nombres;
        	this.aux = new HashSet<String>(nombres);
        }
        public void getFrequency() {
        	System.out.println("> Calculando coincidencias...");
        	for(String s : aux){
                if(Collections.frequency(nombres, s)>1){
                    System.out.println(s+": "+Collections.frequency(nombres,s));
                    comprobar = true;
                }
            }
            if(!comprobar){
                    System.out.println("No hay coincidencias");
                }
        }
}
