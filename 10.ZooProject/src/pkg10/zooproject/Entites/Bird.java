/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.zooproject.Entites;

/**
 *
 * @author jufeq
 */
public class Bird extends Animal {
    private String color;

    public Bird(String color, Enumerator.Skin skin, String name) {
        super(skin, name);
        this.color = color;
    }

    public Bird(String color) {
        this.color = color;
    }

    

   public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
