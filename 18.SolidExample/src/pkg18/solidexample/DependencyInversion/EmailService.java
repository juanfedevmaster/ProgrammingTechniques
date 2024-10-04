/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.DependencyInversion;

/**
 *
 * @author jufeq
 */
public class EmailService implements IMessageService {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando email: " + message);
    }

}
