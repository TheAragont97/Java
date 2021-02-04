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
public class Asignatura {
    //Variables Globales
    private int idAsignaturas;
    private String nombre;
    private Profesor profesor;

    public Asignatura(int idAsignaturas, String nombre, Profesor profesor) {
        this.idAsignaturas = idAsignaturas;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public int getIdAsignaturas() {
        return idAsignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setIdAsignaturas(int idAsignaturas) {
        this.idAsignaturas = idAsignaturas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
}
