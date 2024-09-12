/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14.factorypatternpolymorfism;

/**
 *
 * @author jufeq
 */
public class TransporteFerroviario extends Transporte {

    @Override
    public void enviarTransporte() {
        System.out.println("Envio de la carga: " + getCargaTransporte().getTipoCarga() + " Via Tren");
    }

}
