package com.lugonzo.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        // write your code here

        intDoublyLinkedList dList =new intDoublyLinkedList(2);
        dList.insertItem(3);
        dList.insertItem(4);
        dList.insertItem(5);
        dList.insertItem(6);
        dList.insertItem(7);

        dList.printList();
        System.out.println("=======================");

        dList.deleteNode(4);
        dList.printList();
    }
}
