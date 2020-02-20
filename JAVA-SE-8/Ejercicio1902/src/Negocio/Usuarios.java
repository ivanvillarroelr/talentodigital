package Negocio;

import java.util.HashMap;
import java.util.Map;

public class Usuarios {
	
	HashMap<String,String> diccionario = new HashMap<String,String>();
	
	public Usuarios(){
		super();
	}
	
	public void setLogin(String userName, String password) {
		try {
			this.diccionario.put(userName, password);
			System.out.println("> Usuario ingresado correctamente");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("> Usuario no pudo ser ingresado");
		}
	}
	
	public boolean getPassword(String username, String password) {
		boolean mensaje=false;
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
			if(username.equals(entry.getKey()) & password.equals(entry.getValue())) {
				mensaje = true;
			}
		}
		return mensaje;
	}
}




