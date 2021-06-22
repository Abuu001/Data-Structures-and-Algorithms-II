package com.lugonzo.LinkedList.SinglyLinkedList;

public class sLinkedList {

    class Node {
        Node next;
        int data;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    Node head;

    public void insertFirst(int new_data){

        Node newNode = new Node(new_data);

        newNode.next = head;

        head  = newNode;
    }

    public void printAll(){

        Node n = head;
        while(n != null){
            System.out.print(n.data + " => ");
            n = n.next;
        }
    }

    public void addNodeAtNth(Node nthNode , int data){
        if(nthNode == null){
            System.out.println("the previous given Node cannot be null");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = nthNode.next;
        nthNode.next = newNode;
    }

    public void addNodeAtLast(int new_data){

        Node new_node = new Node(new_data);

        if (head == null)  {
           head = new Node(new_data);
          return;
        }

     new_node.next = null;

     Node last = head;
     while (last.next != null)
        last = last.next;

         last.next = new_node;
     return;
    }



}
