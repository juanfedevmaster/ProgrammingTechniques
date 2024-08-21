/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.doublelinkedlist;

/**
 *
 * @author jufeq
 */
public class DoubleLinkedList {

    private Node head;
    private Node end;

    public DoubleLinkedList() {
    }

    public DoubleLinkedList(Node head, Node end) {
        this.head = head;
        this.end = end;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    // Public Methos of Double Linked List
    public void insertBegining(Node node) {
        if (this.head == null) {
            this.head = node;
            this.end = node;
        } else {
            node.setNext(this.head);
            this.head.setBefore(node);
            this.head = node;
        }
    }

    public void insertEnd(Node node) {
        if (this.head == null) {
            this.head = node;
            this.end = node;
        } else {
            this.end.setNext(node);
            node.setBefore(this.end);
            this.end = node;
        }
    }

    public void insertByIndex(Node node, int index) {
        if (index < -1) {
            System.out.println("The index should be greater than 0.");
            return;
        }

        if (this.head == null) {
            this.head = node;
            this.end = node;
            return;
        }

        if (index <= 0) {
            this.insertBegining(node);
            return;
        }

        var indexReal = 0;
        Node actualNode = this.head;
        while (actualNode != null) {

            if (indexReal == index) {
                break;
            }

            actualNode = actualNode.getNext();
            indexReal++;
        }

        if (actualNode != null) {
            Node nodeBefore = actualNode.getBefore();
            nodeBefore.setNext(node);
            node.setNext(actualNode);
            actualNode.setBefore(node);
        } else if (actualNode == null && index <= indexReal) {
            this.insertEnd(node);
        } else {
            System.out.println("The index should be lower than the list size.");
        }

    }

    public void printList() {
        if (this.head == null) {
            System.out.println("The list is empty.");
        } else {
            var index = 0;
            Node actualNode = this.head;
            while (actualNode != null) {
                System.out.println("Node value: " + actualNode.getValue() + " - Index: " + index);
                actualNode = actualNode.getNext();
                index++;
            }
        }
    }
}
