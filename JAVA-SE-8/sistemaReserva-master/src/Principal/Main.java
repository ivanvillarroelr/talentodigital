package Principal;

import java.util.Map;

import Negocio.ConsultaVuelo;
import Negocio.Usuarios;

public class Main {

	public static void main(String[] args) {
		
		ConsultaVuelo vuelo = new ConsultaVuelo();
		Menu menu = new Menu(vuelo);
		Usuarios usuario = new Usuarios();
		int respuesta = menu.menuPrincipal();
		menu.menuElecciones(respuesta,usuario, vuelo);
	}
}
