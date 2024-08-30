/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.oopexample.Polymorphism;

/**
 *
 * @author jufeq
 */
public class Circle extends Figure {

    public Circle(int radio) {
        this.radio = radio;
    }

    public Circle() {
    }
    
    
    
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        var result = Math.pow(Math.PI * radio, 2);
        return result;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
