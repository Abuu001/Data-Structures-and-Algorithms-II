package com.lugonzo.Tree.BinarySearchTree;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Person1 p1 = new Person1("Abu", 21);
        Person1 p2 = new Person1("Martha", 33);
        Person1 p3 = new Person1("John", 28);
        Person1 p4 = new Person1("Prince", 17);
        Person1 p5 = new Person1("Faith", 4);
        Person1 p6 = new Person1("Jim", 51);

       BinarySearchTree bst = new BinarySearchTree();
        bst.insert(p1);
        bst.insert(p2);
        bst.insert(p3);
        bst.insert(p4);
        bst.insert(p5);
        bst.insert(p6);

        bst.printAll(bst.findNode("Prince"));
        System.out.println("======================================");

        Person1 p = bst.getData(bst.findParent("Jim"));
        System.out.println(p.toString());
    }

}
