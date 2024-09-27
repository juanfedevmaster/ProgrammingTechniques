/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg17.javamdiparentexample.logic;

/**
 *
 * @author jufeq
 */
public class Pais {
    private int id;
    private String nombrePais;

    public Pais() {
    }

    public Pais(int id, String nombrePais) {
        this.id = id;
        this.nombrePais = nombrePais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    public String toString(){
        return this.nombrePais + ": "+this.id;
    }
    
    
}
