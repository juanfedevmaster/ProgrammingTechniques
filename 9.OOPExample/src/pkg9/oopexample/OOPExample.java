/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.oopexample;

import java.util.Scanner;
import pkg9.oopexample.Inheritance.Employee;
import pkg9.oopexample.Inheritance.Student;
import pkg9.oopexample.Inheritance.Teacher;
import pkg9.oopexample.Polymorphism.Circle;
import pkg9.oopexample.Polymorphism.Figure;
import pkg9.oopexample.Polymorphism.Rectangle;
import pkg9.oopexample.Polymorphism.Triangle;

/**
 *
 * @author jufeq
 */
public class OOPExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var option = 0;

        while (true) {
            System.out.println("==========================");
            System.out.println("======= UdeA System ======");
            System.out.println("==========================");
            System.out.println("1. Create Student");
            System.out.println("2. Create Employee");
            System.out.println("3. Create Teacher");
            System.out.println("4. Exit");

            System.out.print("Enter your option: ");
            
            option = scan.nextInt();

            switch (option) {
                case 1:
                    Student student = new Student();
                    break;
                case 2:
                    Employee employee = new Employee();
                    break;
                case 3:
                    Teacher teacher = new Teacher();
                    break;
                case 4:
                    return;

                default:
                    throw new AssertionError();
            }

        }

        /*Figure rec = new Rectangle(10,100);
        Figure circule = new Circle(10);
        Figure triangle = new Triangle();
        
        
        System.out.println("The area of Rectangle is: "+rec.getArea());
        System.out.println("The area of Circule is: "+circule.getArea());
        System.out.println("The area of Triangle is: "+triangle.getArea());*/
    }

}
