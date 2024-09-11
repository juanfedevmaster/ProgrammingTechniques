/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13.opppolymorphism.FourWheels;

import pkg13.opppolymorphism.Vehicle;

/**
 *
 * @author jufeq
 */
public class SUV extends Vehicle{

    private String reference;
    private String motor;
    private boolean turboCompressor;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public boolean isTurboCompressor() {
        return turboCompressor;
    }

    public void setTurboCompressor(boolean turboCompressor) {
        this.turboCompressor = turboCompressor;
    }

    @Override
    public String getMatricule() {
        return this.id + " " + this.getModel();
    }

    @Override
    public void ClaxonSound() {
        System.out.println("Claxoon SUV");
    }

    @Override
    public String getEngine() {
        return "Engine SUV";
    }
}
