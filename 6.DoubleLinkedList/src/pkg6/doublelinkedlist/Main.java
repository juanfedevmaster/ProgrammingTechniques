/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.doublelinkedlist;

/**
 *
 * @author jufeq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertBegining(new Node(10));
        list.insertBegining(new Node(20));
        list.insertBegining(new Node(30));
        list.insertEnd(new Node(40));
        list.insertEnd(new Node(50));
        list.insertEnd(new Node(60));
        
        //list.insertByIndex(new Node(100), 7);
        //list.removeFirstElement();
        //list.removeElement(10);
        //list.removeElementByIndex(0);
        list.printList();
    }
}