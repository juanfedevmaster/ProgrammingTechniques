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
public class Cuadrado extends Rectangulo{
    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
        this.alto = ancho; // Aseguramos que el alto sea igual al ancho
    }
    
    @Override
    public void setAlto(int alto) {
        this.alto = alto;
        this.ancho = alto; // Aseguramos que el ancho sea igual al alto
    }
}
