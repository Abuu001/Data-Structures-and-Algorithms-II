package com.lugonzo.Queue;

public class Intq {

    private int[] q;
    private int size;
    private int total;
    private int front;
    private int rear;

    public Intq(){
        size=100;
        total=0;
        front=0;
        rear=0;
        q = new int[size];
    }

    public Intq(int size){
        this.size=size;
        this.total=0;
        this.front=0;
        this.rear=0;
        q = new int[ this.size];
    }

    public boolean enqueue(int item){
        if(isFull()){
            return false;
        }else {
            total++;
            q[rear] =item;
            rear++;
            return true;
        }

    }

    public int dequeue(){
        int item= q[front];
        total--;
        front++;
        return item;
    }

    public boolean isFull(){
        if(size == total){
            return true;
        }else {
            return false;
        }
    }
}
