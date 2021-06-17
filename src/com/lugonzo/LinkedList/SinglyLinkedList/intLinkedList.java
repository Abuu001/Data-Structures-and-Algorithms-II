package com.lugonzo.LinkedList.SinglyLinkedList;

public class intLinkedList {

    class Node{
        private int value;
        private Node next;
    }

    private Node head;

    public intLinkedList(int item){
        head = new Node();
        head.value=item;
        head.next=null;
    }

    public boolean insertItemAtStart(int item){
        Node n = new Node();
        n.value = item;
        n.next=head;
        head = n;

        return true;
    }

    public boolean insertItemAtEnd(int item){
        Node n = new Node();

        Node newNode;
        newNode = head;

        while(newNode.next !=null){
            newNode = newNode.next;
        }

        n.value=item;
        n.next=null;

        newNode.next =n;

        return true;
    }

    public boolean deleteNode(int item){
        if(head.value == item){
            head=head.next;
            return true;
        }else {
            Node x = head;
            Node y =head.next;

            while(true){
                if(y == null || y.value==item){
                    break;
                }else {
                    x=y;
                    y=y.next;
                }
            }

            if(y != null){
                x.next=y.next;
                return true;
            }else {
                return false;
            }
        }
    }

    public void printList(){
         Node z = head;

         while(z!=null){
             System.out.println(z.value);
             z = z.next;
         }
    }
}
