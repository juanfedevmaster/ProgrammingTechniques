/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18.solidexample;

import pkg18.solidexample.DependencyInversion.EmailService;
import pkg18.solidexample.DependencyInversion.IMessageService;
import pkg18.solidexample.DependencyInversion.NotificationService;
import pkg18.solidexample.DependencyInversion.SMSService;
import pkg18.solidexample.InterfaceSegregation.MultifuntionalDevice;
import pkg18.solidexample.InterfaceSegregation.Printer;
import pkg18.solidexample.InterfaceSegregation.Scanner;
import pkg18.solidexample.LiskovSustitution.CuadradoLiskov;
import pkg18.solidexample.LiskovSustitution.IFigura;
import pkg18.solidexample.LiskovSustitution.Rectangulo;
import pkg18.solidexample.LiskovSustitution.RectanguloLiskov;
import pkg18.solidexample.OpenClose.DeveloperBonusCalculator;
import pkg18.solidexample.OpenClose.Employee;
import pkg18.solidexample.OpenClose.ManagerBonusCalculator;
import pkg18.solidexample.OpenClose.TesterBonusCalculator;
import pkg18.solidexample.SingleResponsability.ReportService;

/**
 *
 * @author jufeq
 */
public class SolidExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Single Responsability
        System.out.println("===========================================================");
        System.out.println("Single Responsability");
        ReportService reportService = new ReportService();
        reportService.generateAndSaveReport("C:\\");

        System.out.println("===========================================================");
        System.out.println("Open Close");
        // Open Close
        Employee manager = new Employee("Milena", 10000000, new ManagerBonusCalculator());
        System.out.println("Manager bonus: " + manager.getBonus());

        Employee dev = new Employee("Camilo", 14000000, new DeveloperBonusCalculator());
        System.out.println("Dev bonus: " + dev.getBonus());

        Employee tester = new Employee("Mateo", 12000000, new TesterBonusCalculator());
        System.out.println("Tester bonus: " + tester.getBonus());

        System.out.println("===========================================================");
        System.out.println("Liskov");
        // Liskov Principle
        IFigura rectangulo = new RectanguloLiskov(4, 5);
        System.out.println("Área del Rectángulo: " + rectangulo.getArea());

        IFigura cuadrado = new CuadradoLiskov(5);
        System.out.println("Área del Cuadrado: " + cuadrado.getArea());

        System.out.println("===========================================================");
        System.out.println("Interface Segregation");

        Printer printer = new Printer();
        printer.print("Documento de ejemplo");

        Scanner scanner = new Scanner();
        scanner.scan("Documento de ejemplo");

        MultifuntionalDevice mfp = new MultifuntionalDevice();
        mfp.print("Documento multifuncional");
        mfp.scan("Documento multifuncional");
        
        System.out.println("===========================================================");
        System.out.println("Dependency Inversion");
        
        IMessageService emailService = new EmailService();
        IMessageService smsService = new SMSService();
        
        
        NotificationService notificationServiceEmail = new NotificationService(emailService);
        notificationServiceEmail.notify("Mensaje importante por Email");

        NotificationService notificationServiceSMS = new NotificationService(smsService);
        notificationServiceSMS.notify("Mensaje importante por SMS");

    }

}
