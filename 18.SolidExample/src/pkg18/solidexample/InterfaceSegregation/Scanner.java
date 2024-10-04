/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.InterfaceSegregation;

/**
 *
 * @author jufeq
 */
public class Scanner implements IScanner {

    @Override
    public void scan(String document) {
        System.out.println("Escaneando: " + document);
    }

}
