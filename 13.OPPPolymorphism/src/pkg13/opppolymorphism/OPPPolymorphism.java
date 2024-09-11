/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.opppolymorphism;

import java.util.ArrayList;
import pkg13.opppolymorphism.AirPlane.Sesna;
import pkg13.opppolymorphism.FourWheels.SUV;
import pkg13.opppolymorphism.Water.TransportShip;

/**
 *
 * @author jufeq
 */
public class OPPPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle common1 = new Sesna();
        Vehicle common2 = new TransportShip();
        
        ArrayList<Vehicle> arrayList = new ArrayList<>();
        
        arrayList.add(common1);
        arrayList.add(common2);
        
        for(Vehicle c : arrayList){
            c.ClaxonSound();
        }
        
    }
    
}
