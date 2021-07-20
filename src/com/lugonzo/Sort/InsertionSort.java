package com.lugonzo.Sort;

import java.util.Arrays;

public class InsertionSort {

    public void sort(int[] arrayToSort){

        for(var i=1;i < arrayToSort.length ; i++){
            var current = arrayToSort[i];
            var j = i-1;

            while(j>=0 && arrayToSort[j] > current ){
                arrayToSort[j+1] = arrayToSort[j];
                j--;
            }

            arrayToSort[j+1] =current;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 7,4,5,3,6,1,2};

        var sorter = new InsertionSort();
        sorter.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
