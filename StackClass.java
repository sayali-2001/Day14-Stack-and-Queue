package com.bl.stackQueue;

public class StackClass {
    public Node head;
    public Node tail;

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    // pushing new data
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    // Display all Node with Value
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
    // Using Pop method to pop all elements
    public void pop() {
        Node current = head;
        while (current != null) {
            if (current == head) {
                head = head.next;
                current = head;
            }
        }
    }
    // Using peak method to find top of the Element
    public int peak() {
        Node current1 = head;
        return current1.data;
    }
    public static void main(String[] args) {
        StackClass obj = new StackClass();
        obj.push(70);
        obj.push(30);
        obj.push(56);

        obj.display();
        System.out.println("Peak Element is = " + obj.peak());
        obj.pop();
        obj.display();

    }
}
