/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.InterfaceSegregation;

/**
 *
 * @author jufeq
 */
public class MultifuntionalDevice implements IPrinter, IScanner{

    @Override
    public void print(String document) {
      System.out.println("Imprimiendo: " + document);
   }

    @Override
    public void scan(String document) {
        System.out.println("Escaneando: " + document);
    }
    
}
