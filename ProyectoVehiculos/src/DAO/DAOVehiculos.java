/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import IDAO.IDAOVehiculo;
import POJOs.Vehiculo;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminarVehiculo(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminarVehiculo(String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminarVehiculos(List<Vehiculo> lstVehiculos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo getVehiculo(String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> getVehiculos() {
        return null;
    }
    public IDAOVehiculo getInstance(){
        if(dao==null){
            dao=new DAOVehiculos();
        }
        return dao;
    }
    
}
