/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.LiskovSustitution;

/**
 *
 * @author jufeq
 */
public class RectanguloLiskov implements IFigura {

    private int ancho;
    private int alto;

    public RectanguloLiskov(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public int getArea() {
        return ancho * alto;
    }
}
