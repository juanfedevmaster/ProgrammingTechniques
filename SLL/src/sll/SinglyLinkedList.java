/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sll;

/**
 *
 * @author juan.quintanag
 */
public class SinglyLinkedList {

    private Node star;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(Node star) {
        this.star = star;
    }

    public Node getStar() {
        return star;
    }

    public void setStar(Node star) {
        this.star = star;
    }

    public void addNode(int value) {
        Node newNode = new Node(value, null);
        if (this.star == null) {
            this.star = newNode;
        } else {
            Node actualNode = this.star;
            while (actualNode.getNext() != null) {
                actualNode = actualNode.getNext();
            }

            actualNode.setNext(newNode);
        }
    }

    public void printAllElement() {
        if (this.star == null) {
            System.out.println("The list is null.");
            return;
        }

        Node actualNode = this.star;
        while (actualNode.getNext() != null) {
            String valueFormat = String.format("The value is %s", actualNode.getValue());
            System.out.println(valueFormat);
            actualNode = actualNode.getNext();
        }
    }
}
