/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13.opppolymorphism;

/**
 *
 * @author jufeq
 */
public abstract class Vehicle {

    private String plate;
    private String brand;
    private String model;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    private String type;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public abstract void ClaxonSound();
    public abstract String getMatricule();
    public abstract String getEngine();
}
