/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocolegio.model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alumno {
    //Variables Globales
    private int idAlumno;
    private String nombre;
    private ArrayList<Asignatura> asignaturas;

    public Alumno(int idAlumno, String nombre, ArrayList<Asignatura> asignaturas) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
}
