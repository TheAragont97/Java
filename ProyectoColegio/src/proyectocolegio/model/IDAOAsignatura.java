/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocolegio.model;

/**
 *
 * @author Usuario
 */
public interface IDAOAsignatura {
    public int insertarAsignatura(Asignatura asignatura);
    public int eliminarAsignatura(Asignatura asignatura);
    public int actualizarAsignatura(Asignatura asignatura);
    public int mostrarAsignatura(Asignatura asignatura);
}
