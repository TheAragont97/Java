/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author USUARIO
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionBD {
    //Variables Globales
    private Connection conn;
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
    
   
    public static void main(String[] args) {
        ConexionBD c= new ConexionBD();
        c.conectar();
        Statement st;
        ResultSet rs;
        try{
            st = c.conn.createStatement();
            rs=st.executeQuery("select * from vehiculo");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("marca")
                +" "+rs.getString("modelo")+" "+rs.getString("matricula"));
            }
            c.conn.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
