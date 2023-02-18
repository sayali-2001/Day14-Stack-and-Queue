package com.bl.stackQueue;

public class QueueClass {

    public static Node head;
    public static Node tail;
    private boolean isEmpty;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    // Append data One By One
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    // Display all the Node with value
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    //Dequeue all the elements
    public void dequeue()  {
        Node current = head;
        while (current != head)  {
            if(current == head)  {
                head = head.next;
                current = head;
            }
        }
    }

    public static void main(String[] args) {
        QueueClass obj = new QueueClass();
        obj.append(56);
        obj.append(30);
        obj.append(70);
        obj.display();
        obj.dequeue();
        obj.display();



    }
}
