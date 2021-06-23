package com.lugonzo.Tree.BinarySearchTree;

public class sBinarySearchTree {

   static class Node {
        Node right,left;
        int data;

        Node (int d){
            this.data = d;
            left = right = null;
        }
    }

    Node root;

    sBinarySearchTree(int val){
        root = new Node(val);
    }

    sBinarySearchTree(){
        root = null;
    }
}
