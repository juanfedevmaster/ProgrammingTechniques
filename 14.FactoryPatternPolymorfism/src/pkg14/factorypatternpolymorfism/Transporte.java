/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14.factorypatternpolymorfism;

/**
 *
 * @author jufeq
 */
public abstract class Transporte {
    
    private Carga cargaTransporte;
    
    public Carga getCargaTransporte() {
        return cargaTransporte;
    }

    public void setCargaTransporte(Carga cargaTransporte) {
        this.cargaTransporte = cargaTransporte;
    }
    
    public abstract void enviarTransporte();
}
