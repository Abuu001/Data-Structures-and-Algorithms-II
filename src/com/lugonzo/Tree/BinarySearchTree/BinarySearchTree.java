package com.lugonzo.Tree.BinarySearchTree;


public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    public class Node{
        private Node lc;
        private Node rc;
        private Person1 data;
    }

    public boolean insert(Person1 item){

        Node n = new Node();
        n.data=item;
        n.lc =null;
        n.rc=null;

        if(root == null){
            root =n;
            return true;
        }

        Node  parent =root;
        Node  child = root;

        while(child != null){
            parent = child;
            if(item.getName().compareTo(child.data.getName()) < 0){
                child = child.lc;
            }else {
                child = child.rc;
            }
        }

        if(item.getName().compareTo(parent.data.getName()) < 0){
            parent.lc  =n;
        }else {
            parent.rc =n;
        }

        return true;
    }

    public void printAll(Node n){
        Node parent = n;

        if(parent != null){
            System.out.println(" " + parent.data);
            printAll(parent.lc);
            printAll(parent.rc);
        }
    }

    public Person1 getData(Node n){
        return n.data;
    }

    public Node findParent(String key){
        Node p = root;
        Node c = root;

        do{
            if(key.compareTo(c.data.getName()) == 0){
                break;
            }

            p = c;
            if(key.compareTo(c.data.getName()) > 0){
               c = c.lc ;
            }else {
                c = c.rc;
            }
        }while (c != null);

        System.out.println(">> "+p.data.getName());

        if (c!=null){
            return p;
        }else {
            return null;
        }
    }

    public Node findNode(String key){
        Node c = root;

        while (c != null){
            if(key.compareTo(c.data.getName()) == 0){
                break;
            }

            if(key.compareTo(c.data.getName()) < 0){
                c= c.lc;
            }else {
                c= c.rc;
            }
        }

        return c;
    }
}
