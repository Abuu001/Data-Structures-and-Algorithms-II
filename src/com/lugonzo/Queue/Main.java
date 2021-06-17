package com.lugonzo.Queue;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Intq q = new Intq();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        //first in first out
        System.out.println(q.dequeue() ); //3
        System.out.println(q.dequeue() ); //4
        System.out.println(q.dequeue() );//5
        System.out.println(q.dequeue() );//6
    }
}
