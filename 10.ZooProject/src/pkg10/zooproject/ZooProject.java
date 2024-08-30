/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.zooproject;

import java.util.ArrayList;
import java.util.Scanner;
import pkg10.zooproject.Entites.Animal;
import pkg10.zooproject.Entites.Enumerator.Skin;
import pkg10.zooproject.Entites.Mammal;

/**
 *
 * @author jufeq
 */
public class ZooProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animal> lstAnimals = new ArrayList<>();
        var option = 0;
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("==========================");
            System.out.println("=========== Zoo ==========");
            System.out.println("==========================");
            System.out.println("1. Create Mammal");
            System.out.println("2. Create Bird");
            System.out.println("3. Create Reptil");
            System.out.println("4. Exit");

            System.out.print("Enter your option: ");

            option = scan.nextInt();
            
            switch(option){
                case 1:
                    Mammal mammal = new Mammal();
                    System.out.print("Insert name of mammal: ");
                    var name = scan.next();
                    
                    mammal.setName(name);
                    System.out.println("Kind of skins.");
                    System.out.println("1. FEATHER");
                    System.out.println("2. SCALES");
                    System.out.println("3. FUR");
                    System.out.print("Insert skin of mammal: ");
                    var skin = scan.nextInt();
                    
                    switch (skin) {
                        case 1:
                            mammal.setSkin(Skin.FEATHER);
                            break;
                        case 2:
                            mammal.setSkin(Skin.SCALES);
                            break;
                        default:
                            mammal.setSkin(Skin.FUR);
                            break;
                    }
                    
                    lstAnimals.add(mammal);
            }
        }
    }

}
