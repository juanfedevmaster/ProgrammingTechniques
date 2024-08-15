/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sll;

/**
 *
 * @author juan.quintanag
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinglyLinkedList singlyList = new SinglyLinkedList();
        singlyList.addNode(1);
        singlyList.addNode(2);
        singlyList.addNode(3);
        singlyList.addNode(4);
        singlyList.addNode(5);
        
        singlyList.printAllElement();
        
    }
    
}
