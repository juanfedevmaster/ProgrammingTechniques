/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15.repasointerfaces;

import java.util.ArrayList;

/**
 *
 * @author jufeq
 */
public class RepasoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Prueba p1 = new PruebaGastronomica("Postre");
        Prueba p2 = new PruebaSanguinea("O", "-");
        Prueba p3 = new PruebaSanguinea("AB", "+");
        
        ArrayList<Prueba> pruebas = new ArrayList<>();
        pruebas.add(p1);
        pruebas.add(p2);
        pruebas.add(p3);
        
        ejecutarPruebas(pruebas);

    }

    public static void ejecutarPruebas(ArrayList<Prueba> pruebas) {
        for (Prueba p : pruebas) {
            if (p != null) {
                System.out.println(p.realizarPrueba());
            }
        }
    }

}
