/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.OpenClose;

/**
 *
 * @author jufeq
 */
public class ManagerBonusCalculator implements IBonusCalculator{

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
    
}
