package com.lugonzo.LinkedList.DoublyLinkedList;

public class sDoublyLinkedList {

    class Node {
        Node prev;
        Node next;
        int data;

        Node(int a){
            this.data =a;
        }
    }

    Node head;

    public void addAtFirst(int data){

        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev =null;

        if(head != null){
            head.prev =newNode;
        }

        head = newNode;
    }

    public void addNodeAtEnd(int data){

        Node newNode = new Node(data);
        Node last = head;

        newNode.next =null;

        // If the Linked List is empty, then make the new  node as head
        if(head == null){
            newNode.prev = null;
            head =newNode;
        }

        while (last.next != null){
            last = last.next;
            last.next = newNode;

            newNode.prev = last;
        }

    }

    public void printAll(){

        Node last = null;
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data + " => " );
            curr = curr.next;
        }

    }

    public void deleteNode(int value){

        Node rem = head;
        //if is head
        if (rem.data == value){
            head = rem.next;
        }

        // TODO incomplete
    }
}
