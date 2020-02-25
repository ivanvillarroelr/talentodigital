package controlador;

public class Usuarios {
	
	private String usuario;
	private String contrasena;

	public Usuarios() {
		super();
	}
	
	public Usuarios(String usuario, String contrasena){
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	
	public String getContrasena() {
		return this.contrasena;
	}
}
