/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15.repasointerfaces;

/**
 *
 * @author jufeq
 */
public class PruebaGastronomica implements Prueba {

    private String tipoComida;

    public PruebaGastronomica() {
    }

    public PruebaGastronomica(String tipoComida) {
        this.tipoComida = tipoComida;
    }
    
    

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public String realizarPrueba() {
        if (this.tipoComida.equals("Postre")) {
            return "Prueba de reposteria";
        } else if (this.tipoComida.equals("Carne")) {
            return "Prueba de gastronomia";
        } else {
            return "Prueba generica de comida";
        }
    }

}
