/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14.factorypatternpolymorfism;

/**
 *
 * @author jufeq
 */
public class TransporteTerrestre {

    private int cantidadCarga;
    private String tipoCarga;

    public int getCantidadCarga() {
        return cantidadCarga;
    }

    public void setCantidadCarga(int cantidadCarga) {
        this.cantidadCarga = cantidadCarga;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }
    
    public void enviarTransporte() {
        System.out.println("Envio de la carga: " + tipoCarga);
    }
}
