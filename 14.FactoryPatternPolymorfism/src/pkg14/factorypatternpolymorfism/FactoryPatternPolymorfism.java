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
        ArrayList<Transporte> transporteMateriales = new ArrayList<>();

        int opcion = 0;
        do {
            System.out.println("******************************");
            System.out.println("*********** Menu *************");
            System.out.println("******************************");
            System.out.println("1. Carbon");
            System.out.println("2. Gasolina");
            System.out.println("3. Madera");
            System.out.println("4. Arena");
            System.out.println("Ingrese la opción: ");

            Transporte transporte;
            Carga carga = new Carga();
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    transporte = new TransporteMaritimo();
                    System.out.println("Ingrese la cantidad de la carga: ");

                    carga.setCantidadCarga(scan.nextInt());
                    carga.setTipoCarga("Carbon");
                    carga.setUnidadMedida("Ton");

                    transporte.setCargaTransporte(carga);
                    transporteMateriales.add(transporte);
                    break;
                case 2:
                    transporte = new TransporteTerrestre();
                    
                    System.out.println("Ingrese la cantidad de la carga: ");
                    carga.setCantidadCarga(scan.nextInt());
                    carga.setTipoCarga("Gasolina");
                    carga.setUnidadMedida("Litros");
                    
                    transporte.setCargaTransporte(carga);
                    transporteMateriales.add(transporte);
                    break;
                case 3:
                    transporte = new TransporteTerrestre();
                    System.out.println("Ingrese la cantidad de la carga: ");

                    carga.setCantidadCarga(scan.nextInt());
                    carga.setTipoCarga("Madera");
                    carga.setUnidadMedida("Ton");
                    
                    transporte.setCargaTransporte(carga);
                    transporteMateriales.add(transporte);
                    break;
                    
                case 4:
                    transporte = new TransporteFerroviario();
                    System.out.println("Ingrese la cantidad de la carga: ");
                    
                    carga.setCantidadCarga(scan.nextInt());
                    carga.setTipoCarga("Arena");
                    carga.setUnidadMedida("Ton");
                    
                    transporte.setCargaTransporte(carga);
                            
                    transporteMateriales.add(transporte);
                    break;
                default:
                    opcion = 0;
                    break;
            }
        } while (opcion != 0);

        for (Transporte trans : transporteMateriales) {
            trans.enviarTransporte();
        }
    }
}
