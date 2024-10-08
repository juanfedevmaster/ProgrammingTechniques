/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14.factorypatternpolymorfism;

/**
 *
 * @author jufeq
 */
public class TransporteMaritimo extends Transporte implements IManifiesto{
    
    @Override
    public void enviarTransporte() {
        System.out.println("Envio de la carga: " + getCargaTransporte().getTipoCarga()+ " Via Barco");
    }

    @Override
    public void permisoArribo() {
        System.out.println("Entregar permiso");
    }
}
