/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.circulalinkedlist;

/**
 *
 * @author juan.quintanag
 */
public class CircularLinkedList {

    private Node header;

    public CircularLinkedList() {
    }

    public CircularLinkedList(Node header) {
        this.header = header;
    }

    public Node getStar() {
        return header;
    }

    public void setStar(Node header) {
        this.header = header;
    }

    public void addNode(int value) {
        Node newNode = new Node(value, null);
        if (this.header == null) {
            this.header = newNode;
            newNode.setNext(this.header);
        } else {
            Node actualNode = this.header;
            while (actualNode.getNext() != this.header) {
                actualNode = actualNode.getNext();
            }

            newNode.setNext(this.header);
            actualNode.setNext(newNode);
        }
    }

    public void deleteFirstElement() {
        if (this.header == null) {
            System.out.println("The list is empty.");
        } else if (this.header.getNext() == this.header) {
            this.header = null;
        } else {
            Node nodoActual = this.header;
            while (nodoActual.getNext() != this.header) {
                nodoActual = nodoActual.getNext();
            }

            this.header = this.header.getNext();
            nodoActual.setNext(this.header);
        }
    }

    public void deleteElement(int userValue) {
        if (this.header == null) {
            System.out.println("The list is empty.");
        }

        Node nodoActual = this.header;
        Node nodoBefore = null;
        while (true) {
            if (nodoActual.getValue() == userValue) {
                break;
            }

            nodoBefore = nodoActual;
            nodoActual = nodoActual.getNext();

            if (nodoActual == this.header) {
                return;
            }
        }

        if (nodoActual == this.header) {
            if (this.header.getNext() == this.header) {
                this.header = null;
            } else {
                this.header = this.header.getNext();
                nodoBefore.setNext(this.header);
            }
        } else {
            nodoBefore.setNext(nodoActual.getNext());
        }
    }

    public void printAllElement() {
        if (this.header == null) {
            System.out.println("The list is null.");
            return;
        }

        Node actualNode = this.header;
        while (actualNode.getNext() != this.header) {
            String valueFormat = String.format("The value is %s", actualNode.getValue());
            System.out.println(valueFormat);
            actualNode = actualNode.getNext();
        }

        String valueFormat = String.format("The value is %s", actualNode.getValue());
        System.out.println(valueFormat);
    }
}
