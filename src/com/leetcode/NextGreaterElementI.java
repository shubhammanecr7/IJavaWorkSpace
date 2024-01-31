package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        int[] result = nextGreaterElement(num1, num2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        //map to store next greater element for each element in num2 array
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        //traversing through nums2
        for(int num : nums2){
            while (!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        //now we will create the result array for the element present in nums1
        //and check in map if there is an element present for next greater
        //because in we stored map in such a way that,
        // num as key & nextGreaterElement as value
        //now we will take out nextGreaterElement for each num and if not present
        //we put -1 into the result array

        //here we create an result array of length nums1
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            //here we try to find NGE value for each element in nums1 array
            //if not available then we put -1 in the result array
            result[i] = map.getOrDefault(nums1[i],-1);
        }
        return result;
    }
}
