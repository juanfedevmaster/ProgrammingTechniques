/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.stacksandqueues;

import java.util.Stack;

/**
 *
 * @author jufeq
 */
public class StacksAndQueues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> stackInts = new Stack<>();

        stackInts.push(10);
        stackInts.push(20);
        stackInts.push(30);

        System.out.println("Peak:" + stackInts.peek());
        System.out.println("Size:" + stackInts.size());
        System.out.println("Peak:" + stackInts.pop());
        System.out.println("Size:" + stackInts.size());
        System.out.println("Peak:" + stackInts.peek());

    }

}
