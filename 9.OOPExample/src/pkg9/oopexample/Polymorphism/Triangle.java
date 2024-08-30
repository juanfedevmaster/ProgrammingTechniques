/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.oopexample.Polymorphism;

/**
 *
 * @author jufeq
 */
public class Triangle extends Figure {

    private int base;
    private int height;
    private int cateto;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCateto() {
        return cateto;
    }

    public void setCateto(int cateto) {
        this.cateto = cateto;
    }

    @Override
    public double getArea() {
        var result = (base * height) / 2;
        return result;
    }

    @Override
    public double getPerimeter() {
        var result = base + height + cateto;
        return result;
    }

}
