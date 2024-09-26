/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg17.javamdiparentexample.logic;

/**
 *
 * @author jufeq
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int identificacion;
    private String nacimiento;
    private String sexo;
    private String nacionalidad;
    private String defuncion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int identificacion, String nacimiento, String sexo, String nacionalidad, String defuncion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.defuncion = defuncion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDefuncion() {
        return defuncion;
    }

    public void setDefuncion(String defuncion) {
        this.defuncion = defuncion;
    }

}
