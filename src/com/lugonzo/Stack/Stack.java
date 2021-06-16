package com.lugonzo.Stack;

public class Stack {

    public static void main(String[] args) {
        // write your code here
        intStack intStack = new intStack();

        if(!intStack.isFull()){
            intStack.push(2);
            intStack.push(4);
            intStack.push(5);
            intStack.push(6);
        }

        System.out.println(intStack.pop()); //6
        System.out.println(intStack.pop()); //5

        Person person1  = new Person("Abu","123");
        Person person2 = new Person("Tepee","456");

        PersonStack personStack = new PersonStack();
        personStack.push(person1);
        personStack.push(person2);

        System.out.println(personStack.pop().toString()); // Name Tepee Rollno 456
    }
}
