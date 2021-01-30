/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.ConexionBD;
import IDAO.IDAOVehiculo;
import POJOs.Vehiculo;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DAOVehiculos implements IDAOVehiculo{

    //Atributos
    private IDAOVehiculo dao=null;
    //private Connection con=null;
    private DAOVehiculos() {
        
    }
    
    @Override
    public int insertarVehiculo(Vehiculo vehiculo) {
        int result=0;
        ConexionBD c= new ConexionBD();
        c.conectar();
        Statement st;
        ResultSet rs;
        try{
            st = c.conn.createStatement();
            rs=st.executeQuery("INSERT INTO vehiculo(marca,modelo,matricula) VALUES("+vehiculo.getMarca()+","+vehiculo.getModelo()+","+vehiculo.getMatricula()+")");
//            while(rs.next()){
//                System.out.println(rs.getInt("id")+" "+rs.getString("marca")
//                +" "+rs.getString("modelo")+" "+rs.getString("matricula"));
//            }
            result=0;
            c.conn.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
            result=-1;
        }
        return result;
    }

    @Override
    public int eliminarVehiculo(Vehiculo vehiculo) {
        int result=0;
        ConexionBD c= new ConexionBD();
        c.conectar();
        Statement st;
        ResultSet rs;
        try{
            st = c.conn.createStatement();
            rs=st.executeQuery("DELETE FROM vehiculo WHERE marca='"+vehiculo.getMarca()+"'");
//            while(rs.next()){
//                System.out.println(rs.getInt("id")+" "+rs.getString("marca")
//                +" "+rs.getString("modelo")+" "+rs.getString("matricula"));
//            }
            result=0;
            c.conn.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
            result=-1;
        }
        return result;
    }

    @Override
    public int eliminarVehiculo(String matricula) {
        int result=0;
        ConexionBD c= new ConexionBD();
        c.conectar();
        Statement st;
        ResultSet rs;
        try{
            st = c.conn.createStatement();
            rs=st.executeQuery("DELETE FROM vehiculo WHERE matricula='"+matricula+"'");
//            while(rs.next()){
//                System.out.println(rs.getInt("id")+" "+rs.getString("marca")
//                +" "+rs.getString("modelo")+" "+rs.getString("matricula"));
//            }
            result=0;
            c.conn.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
            result=-1;
        }
        return result;
    }

    @Override
    public int eliminarVehiculos(List<Vehiculo> lstVehiculos) {
        int result=0;
        ConexionBD c= new ConexionBD();
        c.conectar();
        Statement st;
        ResultSet rs;
        try{
            st = c.conn.createStatement();
            for(int i=0;i<lstVehiculos.size();i++){
                rs=st.executeQuery("DELETE FROM vehiculo WHERE marca='"+lstVehiculos.get(i)+"'");
            }
//            while(rs.next()){
//                System.out.println(rs.getInt("id")+" "+rs.getString("marca")
//                +" "+rs.getString("modelo")+" "+rs.getString("matricula"));
//            }
            result=0;
            c.conn.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
            result=-1;
        }
        return result;
    }

    @Override
    public Vehiculo getVehiculo(String matricula) {
        ConexionBD c= new ConexionBD();
        Vehiculo v=null;
        c.conectar();
        Statement st;
        ResultSet rs;
        try{
            st = c.conn.createStatement();
            rs=st.executeQuery("SELECT * FROM vehiculo WHERE matricula="+matricula+"");
            while(rs.next()){
                v = new Vehiculo(rs.getString("marca"),rs.getString("modelo"),rs.getString("matricula"));
            }
            c.conn.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        return v;
    }

    @Override
    public List<Vehiculo> getVehiculos() {
        ConexionBD c= new ConexionBD();
        List<Vehiculo> lstVehiculo= new ArrayList<Vehiculo>();
        Vehiculo v=null;
        c.conectar();
        Statement st;
        ResultSet rs;
        try{
            st = c.conn.createStatement();
            rs=st.executeQuery("SELECT * FROM vehiculo");
            while(rs.next()){
                v = new Vehiculo(rs.getString("marca"),rs.getString("modelo"),rs.getString("matricula"));
                lstVehiculo.add(v);
            }
            c.conn.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        return (List)v;
    }
    public IDAOVehiculo getInstance(){
        if(dao==null){
            dao=new DAOVehiculos();
        }
        return dao;
    }
    
}
