/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg17.javamdiparentexample.logic;

import java.util.ArrayList;

/**
 *
 * @author jufeq
 */
public class Usuario extends Persona {

    private String nombreUsario;
    private String password;
    
    public Usuario() {
    }

    public Usuario(String nombreUsario, String password) {
        this.nombreUsario = nombreUsario;
        this.password = password;
    }

    public String getNombreUsario() {
        return nombreUsario;
    }

    public void setNombreUsario(String nombreUsario) {
        this.nombreUsario = nombreUsario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
