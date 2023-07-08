
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
     public static final String usuario = "u3hom2b7efufgrd5";
    public static final String clave = "0S5D8lVARCPUX7FaZ7U6";
    public static final String url="jdbc:mysql://bweeg4qw6vcxmzqudh8z-mysql.services.clever-cloud.com:3306/bweeg4qw6vcxmzqudh8z";
    
    public Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //retorna la clase asociada a una cadena
            con = DriverManager.getConnection(url,usuario,clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion: ");
        }
        return con;
    }
}

