package com.lugonzo.HashTable;

import java.util.Arrays;

public class HashTable {

  String[] theArray;
  int arraySize;
  int itemsInArray = 0;

  public HashTable(int size){
     arraySize = size;
     theArray = new String[size];
     Arrays.fill(theArray,"-1");
  }

  public void hashFunction(String[]stringForArray ,String[] theArray){
     for(int n =0;n < stringForArray.length ; n++){
      String newElementVal = stringForArray[n];
      theArray[Integer.parseInt(newElementVal)] = newElementVal;
     }
  }


 public static void main(String[] args) {
     HashTable hash1 = new HashTable(30);
     String[] elementsToAdd = {"1" , "5","17","21","26"};

     hash1.hashFunction(elementsToAdd, hash1.theArray);
     System.out.println(hash1);

 }
}


