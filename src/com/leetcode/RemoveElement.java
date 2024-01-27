package com.leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val =3; //remove all occurrences of 3
        int ptr = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[ptr++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(ptr);
    }
}
