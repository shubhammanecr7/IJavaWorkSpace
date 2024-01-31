package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures ={73,74,75,71,69,72,76,73}; // output [1,1,4,2,1,1,0,0]
        int[] result =  dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }

    private static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[temperatures.length];
        //we start checking from last index for next greater temperature index
        //and if found then we put index difference between current and previous
        //index which was pushed to the stack (cIndex = current index)
        for(int cIndex = temperatures.length - 1; cIndex >= 0; cIndex--) {
            //before checking for next greater temperature we pop out all indexes
            //we stored before which have smaller temperature than current index temperature
            while(!stack.isEmpty() && temperatures[cIndex] >= temperatures[stack.peek()]) {
                stack.pop();
            }

            //after passing above condition stack is only left with index having greaterTemp
            // now if temperature at current index is smaller than temperature
            // at index stored in stack then we store their index difference
            // in result array
            if (!stack.isEmpty()){
                // we store difference between index present in stack and current index
                result[cIndex] = stack.peek() - cIndex;
            }
            stack.push(cIndex);
        }
        return result;
    }
}
