/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovehiculos.model;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    //Atributos
    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo(){
        this.matricula="";
        this.marca="";
        this.modelo="";
    }
    
    public Vehiculo(String marca, String modelo, String matricula) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
