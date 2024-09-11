/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13.opppolymorphism.Water;

import pkg13.opppolymorphism.Vehicle;

/**
 *
 * @author jufeq
 */
public class TransportShip extends Vehicle{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void ClaxonSound() {
        System.out.println("Claxon Transport Ship");
    }

    @Override
    public String getMatricule() {
        return this.id + " " + this.getModel();
    }

    @Override
    public String getEngine() {
        return "Engine Transport Ship";
    }
}
