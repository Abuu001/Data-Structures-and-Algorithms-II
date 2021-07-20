package com.lugonzo.Sort;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[]arr){
        for(int i =0;i<arr.length;i++){
            for(int j =1; j<arr.length;j++){
                if(arr[i] < arr[j]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public void swap(int[] arr ,int index1, int index2){
        var temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {7,4,9,5,1,2,3,6,8};

        var sorter = new InsertionSort();
        sorter.sort(numbers);

        System.out.println(Arrays.toString(numbers));  //[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
