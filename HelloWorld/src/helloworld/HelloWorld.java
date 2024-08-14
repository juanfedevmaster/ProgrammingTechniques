/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var option = 3;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("==================");
            System.out.println("1. Add number");
            System.out.println("2. Delete number");
            System.out.println("3. Exit");
            System.out.println("==================");
            System.out.println("Choose option: ");

            option = scan.nextInt();

            if (option == 1) {
                var result = addNumbers(5, 4);
                System.out.println(result);
            } else if (option == 2) {
                var result = deleteNumbers(5, 4);
                System.out.println(result);
            }

        } while (option != 3);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int deleteNumbers(int a, int b) {
        return a - b;
    }

}
