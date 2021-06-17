package com.lugonzo.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        // write your code here

        intLinkedList list = new intLinkedList(3);
        list.insertItemAtStart(5);
        list.insertItemAtStart(8);
        list.insertItemAtStart(9);
        list.insertItemAtStart(11);

        list.printList(); // 11, 9,8,5,3
        System.out.println("===================================");
        list.deleteNode(5);
        list.printList();  // 11, 9,8,3

        System.out.println("===================================");
        list.insertItemAtEnd(7);
        list.printList();
    }
}
