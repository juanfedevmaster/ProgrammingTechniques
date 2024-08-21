/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.doublelinkedlist;

/**
 *
 * @author jufeq
 */
public class Node {
    private int value;
    private Node next;
    private Node before;
    
    public Node(int value, Node next, Node before) {
        this.value = value;
        this.next = next;
        this.before = before;
    }
    
    public Node(int value) {
        this.value = value;
        this.next = null;
        this.before = null;
    }

    public Node() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getBefore() {
        return before;
    }

    public void setBefore(Node before) {
        this.before = before;
    }
    
    
    
}
