package com.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = {2,2,3,3,4,4,5,5};
        System.out.println(Arrays.toString(a));

        //without using temp array
        /* by using this approach we can move all unique elements at start
        * if we print the array till temp position we will only get unique elements
        * in the given sorted array */
        int temp = 0;

        for(int i = 1 ; i<a.length ; i++) {
            if(a[temp] != a[i]) {
                temp++;
                a[temp] = a[i];
            }
        }
        System.out.println(Arrays.toString(a));

        // using temp array
       /* int[] temp = new int[a.length];
        int ptr = 0;

        temp[ptr] = a[0];
        for(int i = 1; i < a.length; i++){
            if(temp[ptr] != a[i]){
                ptr++;
                temp[ptr] = a[i];
            }
        }
        System.out.println(Arrays.toString(temp));*/
    }
}
