package com.lugonzo.Tree.BinarySearchTree;

public class Person1 {
    private String name;
    private int age;

    public Person1(String n , int a){
        this.name=n;
        this.age=a;
    }

    public String toString(){
        return "[{Name " + this.name + " , age " + this.age +"} ]";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}
