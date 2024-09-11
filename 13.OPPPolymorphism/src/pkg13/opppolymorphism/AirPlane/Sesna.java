/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13.opppolymorphism.AirPlane;

import pkg13.opppolymorphism.Vehicle;

/**
 *
 * @author jufeq
 */
public class Sesna extends Vehicle{

    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public void ClaxonSound() {
        System.out.println("Claxon of Sesna");
    }

    @Override
    public String getMatricule() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getEngine() {
        return "Engine Sesna";
    }

}
