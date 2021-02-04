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
public class Profesor {
    //Variables Globales
    private int idProfesor;
    private String nombre;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Alumno> alumnos;

    public Profesor(int idProfesor, String nombre, ArrayList<Asignatura> asignaturas, ArrayList<Alumno> alumnos) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.alumnos = alumnos;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
}
