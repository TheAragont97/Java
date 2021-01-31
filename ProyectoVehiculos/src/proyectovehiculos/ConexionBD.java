/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovehiculos;

/**
 *
 * @author USUARIO
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    //Variables Globales
    public Connection conn;
    private String host="localhost";
    private String port="3307";
    private String dbName="clase";
    private String user="root";
    private String password="1234";
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://"+this.host+":"+this.port+"/"+this.dbName;
            conn=DriverManager.getConnection(url, this.user, this.password);
            System.out.println("Conexion Exitosa");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error, no se pudo conectar con la BD: "+e);
        }
        return conn;
    }
}
