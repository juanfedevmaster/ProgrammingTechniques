/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.functionalparadigm;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jufeq
 */
public class FunctionalParadigm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StaticFunctions.holaMundo();
        
        Random random = new Random();
        
        ArrayList<Persona> lstPersona = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            Persona p = new Persona();
            p.setApellido("Quintana");
            p.setNombre("Juan Felipe");
            p.setRandom(random.nextInt());
            lstPersona.add(p);
        }

        System.out.println("Termine"+ lstPersona.size());
    }

}
