/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14.factorypatternpolymorfism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class FactoryPatternPolymorfism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<TransporteMaritimo> transportesMaritimos = new ArrayList<>();
        ArrayList<TransporteTerrestre> transportesTerrestres = new ArrayList<>();
        int opcion = 0;
        do {
            System.out.println("******************************");
            System.out.println("*********** Menu *************");
            System.out.println("******************************");
            System.out.println("1. Carbon");
            System.out.println("2. Gasolina");
            System.out.println("3. Madera");
            System.out.println("Ingrese la opción: ");

            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    TransporteMaritimo transporte1 = new TransporteMaritimo();
                    System.out.println("Ingrese la cantidad de la carga: ");
                    transporte1.setCantidadCarga(scan.nextInt());
                    transporte1.setTipoCarga("Carbon");
                    transportesMaritimos.add(transporte1);
                    break;
                case 2:
                    TransporteTerrestre transporte2 = new TransporteTerrestre();
                    System.out.println("Ingrese la cantidad de la carga: ");
                    transporte2.setCantidadCarga(scan.nextInt());
                    transporte2.setTipoCarga("Gasolina");
                    transportesTerrestres.add(transporte2);
                    break;
                case 3:
                    TransporteTerrestre transporte3 = new TransporteTerrestre();
                    System.out.println("Ingrese la cantidad de la carga: ");
                    transporte3.setCantidadCarga(scan.nextInt());
                    transporte3.setTipoCarga("Madera");
                    transportesTerrestres.add(transporte3);
                    break;
                default:
                    opcion = 0;
                    break;
            }
        } while (opcion != 0);

        for (TransporteTerrestre trans : transportesTerrestres) {
            trans.enviarTransporte();
        }
        
        for (TransporteMaritimo trans : transportesMaritimos) {
            trans.enviarTransporte();
        }
    }
}
