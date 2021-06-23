package com.lugonzo.LinkedList.SinglyLinkedList;

public class sLinkedList {

    Node head;

    class Node {
        Node next;
        int data;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }


    public void insertFirst(int new_data){

        Node newNode = new Node(new_data);

        newNode.next = head;

        head  = newNode;
    }

    public void printAll(){

        Node n = head;
        while(n != null){
            System.out.print(n.data + " => " );
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

    public void deleteNode(int key){

        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public  int getSize(){

        Node n = head;
        int count =0;

        while(n != null){
            count++;
            n = n.next;
        }
        return count;
    }

    public boolean isNodePresent(int value){

        Node current = head;

        if(current.data == value){
            return true;
        }

        while(current != null ){

            if(current.data == value){
                return true;
            }

            current = current.next;
        }

        return false;
    }


    public int  getValueAtIndex(int index){
        int count =0;
        Node current = head;

        while(current != null){
            if(count == index){
                return current.data;
            }
            count++;
            current = current.next;
        }

        return 0;
    }
}
