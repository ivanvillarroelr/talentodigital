package vista;
import controlador.Menu;
import modelo.Conexion;

public class Principal {
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		int respuesta = menu.menuPrincipal();
		menu.casesMenuPrincipal(respuesta);
	}
}
