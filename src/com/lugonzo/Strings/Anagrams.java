package com.lugonzo.Strings;

import java.util.Arrays;

public class Anagrams {

    static boolean areAnagrams(char[] str1 , char[] str2){

        int n1 = str1.length;
        int n2 = str2.length;

        //if length r not same they are not anagrams
        if(n1 != n2){
            return  false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i =0 ; i < n1 ; i++){
            if (str1[i] != str2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'e', 's' };

        if(areAnagrams(str1,str2)){
            System.out.println("They are anagrams");
        }else {
            System.out.println("They are not anagrams");
        }
    }
}
