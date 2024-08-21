/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.circulalinkedlist;

/**
 *
 * @author juan.quintanag
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.addNode(1);
        circularList.addNode(2);
        circularList.addNode(3);
        circularList.addNode(4);
        circularList.addNode(5);
        
        circularList.printAllElement();
        System.out.println("=======================");
        circularList.deleteElement(2);
        circularList.printAllElement();
    }
    
}
