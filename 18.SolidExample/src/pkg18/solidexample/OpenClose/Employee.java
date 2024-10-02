/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.OpenClose;

/**
 *
 * @author jufeq
 */
public class Employee {

    private String name;
    private double salary;
    private IBonusCalculator bonusCalculator;

    public Employee(String name, double salary, IBonusCalculator bonusCalculator) {
        this.name = name;
        this.salary = salary;
        this.bonusCalculator = bonusCalculator;
    }

    public double getBonus() {
        return bonusCalculator.calculateBonus(salary);
    }
}
