/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.OpenClose;

/**
 *
 * @author jufeq
 */

// Asi es como lo teniamos. Las demas clases he interfaces explican
// como deben de implementar el Open Close.
public class BonusCalculator {

    public double calculateBonus(String employeeType, double salary) {
        if (employeeType.equals("Manager")) {
            return salary * 0.10; // Bonificación para manager
        } else if (employeeType.equals("Developer")) {
            return salary * 0.05; // Bonificación para developer
        }
        
        return 0;
    }
}
