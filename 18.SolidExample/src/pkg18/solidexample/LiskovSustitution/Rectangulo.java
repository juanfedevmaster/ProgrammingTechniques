/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.LiskovSustitution;

/**
 *
 * @author jufeq
 */

// Este es el ejemplo donde se viola el principio de Liskov
public class Rectangulo {
    protected int ancho;
    protected int alto;
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
     public int getArea() {
        return ancho * alto;
    }
}
