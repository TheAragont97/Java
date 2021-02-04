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
public interface IDAOAlumno {
    public int insertarAlumno(Alumno alumno);
    public int eliminarAlumno(Alumno alumno);
    public int actualizarAlumno(Alumno alumno);
    public int mostrarAlumno(Alumno alumno);
}
