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

        System.out.println("=============Linked List 2 (sLinkedList)======================");

        sLinkedList list2 = new sLinkedList();
        list2.insertFirst(22);
        list2.insertFirst(23);
        list2.insertFirst(24);
        list2.insertFirst(25); // 25 => 24 => 23 => 22 =>

        list2.addNodeAtLast(33);  //25 => 24 => 23 => 22 => 33 =>
        list2.printAll();

        System.out.println();
        list2.deleteNode(22); //25 => 24 => 23 => 33 =>
        list2.printAll();

        System.out.println();
        System.out.println(list2.getSize()); //4

        System.out.println();
        System.out.println(list2.isNodePresent(25)); //true
        System.out.println(list2.isNodePresent(77)); //false

        System.out.println();  //25 => 24 => 23 => 33 =>
        System.out.println(list2.getValueAtIndex(1)); //24
        System.out.println(list2.getValueAtIndex(3)); //33
    }
}
