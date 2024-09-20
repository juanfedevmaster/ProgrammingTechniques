/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15.repasointerfaces;

/**
 *
 * @author jufeq
 */
public class PruebaSanguinea implements Prueba {

    private String tipoSangre;

    private String rh;

    public PruebaSanguinea() {
    }

    public PruebaSanguinea(String tipoSangre, String rh) {
        this.tipoSangre = tipoSangre;
        this.rh = rh;
    }
    
    

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String realizarPrueba() {
        if (this.tipoSangre.equals("O") && this.rh.equals("-")) {
            return "Donador universal";
        } else if (this.tipoSangre.equals("AB") && this.rh.equals("+")) {
            return "Receptor Universal";
        }else{
            return this.tipoSangre + this.rh;
        }
    }
}
