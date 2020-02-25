package modelo;

//PASO 1: IMPORTS NECESARIOS
import java.sql.*;

public class Conexion {
   // Nombre del driver JDBC y URL de la BD
   static final String JDBC_DRIVER = "org.postgresql.Driver";  
   static final String DB_URL = "jdbc:postgresql://104.154.223.104:5432/tatooine";

   //  Credenciales de DB
   static final String USER = "ironman";
   static final String PASS = "rancagua2020";
   
   public boolean consultarUser(String usuario, String contrasena) {
	   Connection conn = null;
	   Statement stmt = null;
	   boolean respuesta = false;
	   try{
	      //PASO 2: REGISTRA EL JDBC DRIVER
	      Class.forName("org.postgresql.Driver");
	
	      //PASO 3: ABRE UNA CONEXION
	      System.out.println("Conectándose a la base de datos...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	
	      //PASO 4: EJECUTA LA CONSULTA
	      System.out.println("Consultando la base de datos...");
	      stmt = conn.createStatement();
	      String sql = "SELECT username, password FROM tienda.usuarios WHERE username='"+usuario+"'";
	      ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String passwordConsulta = rs.getString("password");
				if(contrasena.equals(passwordConsulta)) {
					respuesta = true;
				}
				else {
					respuesta = false;
				}
			}
	      //PASO 6: CIERRA LOS RECURSOS
	      rs.close(); 
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Maneja errores para el JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Maneja errores para Class.forName
	      e.printStackTrace();
	   }
//	   }finally{
//	      //Se cierran recursos otra vez. 
//	      try{
//	         if(stmt!=null)
//	            stmt.close();
//	      }catch(SQLException se2){
//	      }// nothing we can do
//	      try{
//	         if(conn!=null)
//	            conn.close();
//	      }catch(SQLException se){
//	         se.printStackTrace();
//	      }//end finally try
//	   }//end try
	   return respuesta;
   }


	public void displayProductos() {
	   Connection conn = null;
	   Statement stmt = null;
	   boolean respuesta = false;
	   try{
	      //PASO 2: REGISTRA EL JDBC DRIVER
	      Class.forName("org.postgresql.Driver");
	
	      //PASO 3: ABRE UNA CONEXION
	      System.out.println("Conectándose a la base de datos...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	
	      //PASO 4: EJECUTA LA CONSULTA
	      System.out.println("Consultando la base de datos... \n");
	      stmt = conn.createStatement();
	      String sql = "SELECT * FROM tienda.productos";
	      ResultSet rs = stmt.executeQuery(sql);
	      System.out.printf("%-15s %-35s %-15s %-15s\n","ID PRODUCTO", "NOMBRE","PRECIO","STOCK");
	      System.out.println("___________________________________________________________________________");
	    
	      while(rs.next()){
	    	  //Retrieve by column name
	    	  int id  = rs.getInt("ID");
	    	  String nombreProducto = rs.getString("nombre_producto");
	    	  int precio = rs.getInt("precio");
	    	  int stock = rs.getInt("stock");
	    
	    	  //Display values
	    	  System.out.printf("%-15s %-35s %-15s %-15s\n", id, nombreProducto, precio, stock);
	    	  System.out.println("___________________________________________________________________________");
	      }
	      //PASO 6: CIERRA LOS RECURSOS
	      rs.close(); 
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Maneja errores para el JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Maneja errores para Class.forName
	      e.printStackTrace();
	   }
//	   }finally{
//	      //Se cierran recursos otra vez. 
//	      try{
//	         if(stmt!=null)
//	            stmt.close();
//	      }catch(SQLException se2){
//	      }// nothing we can do
//	      try{
//	         if(conn!=null)
//	            conn.close();
//	      }catch(SQLException se){
//	         se.printStackTrace();
//	      }//end finally try
//	   }//end try
}


}





