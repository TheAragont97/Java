/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovehiculos;

import proyectovehiculos.model.Vehiculo;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Controller {
    private DAOVehiculos dao=null;
    public void cargarTabla(JTable tabla){
         List<Vehiculo> lstVehiculo = dao.getInstance().getVehiculos();
         DefaultTableModel modelo= new DefaultTableModel();
         modelo.addColumn("Marca");
         modelo.addColumn("Modelo");
         modelo.addColumn("Matricula");
         for(Vehiculo vehiculo:lstVehiculo){
             Object[] registroLeido = new Object[3];
             registroLeido[0]=vehiculo.getMarca();
             registroLeido[1]=vehiculo.getModelo();
             registroLeido[2]=vehiculo.getMatricula();
             System.out.println(vehiculo.getMarca()+vehiculo.getModelo()+vehiculo.getMatricula());
             modelo.addRow(registroLeido);
         }
         tabla.setModel(modelo);
    }
    public void insertarTabla(JTable jTable1,JTextField txtMarca,JTextField txtModelo,JTextField txtMatricula){
        DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
        Object[] fila= new Object[3];
        fila[0]=txtMarca.getText();
        fila[1]=txtModelo.getText();
        fila[2]=txtMatricula.getText();
        modelo.addRow(fila);
        int result=dao.getInstance().insertarVehiculo(new Vehiculo(txtMarca.getText(),txtModelo.getText(),txtMatricula.getText()));
        if(result==0){
            System.out.println("Se han insertado correctamente los datos");
        }
        else{
            System.out.println("Error en la inserción de datos");
        }
        jTable1.setModel(modelo);
    }
}
