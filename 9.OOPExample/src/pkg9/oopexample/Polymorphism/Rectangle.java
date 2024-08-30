/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.oopexample.Polymorphism;

/**
 *
 * @author jufeq
 */
public class Rectangle extends Figure{

    private int width;
    private int length;
    
    public Rectangle(){}
    
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(int length) {
        this.length = length;
        this.width = length;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    public double getArea() {
        var area = width * length;
        return area;
    }

    public double getPerimeter() {
        var perimeter = 2 * (this.width + this.length);
        return perimeter;
    }
}
