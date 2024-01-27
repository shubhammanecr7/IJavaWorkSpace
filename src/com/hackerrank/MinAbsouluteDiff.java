package com.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinAbsouluteDiff {
    /* given a list of integers find the minimum absolute difference between
    * any two pair of elements */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, -7, 0);
        int minDiff = minimumAbsoluteDifference(list);
        System.out.println(minDiff);
    }
    public static int minimumAbsoluteDifference(List<Integer> list) {
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(list);
        for (int i = 0; i < list.size()-1; i++) {
            int currDiff = Math.abs(list.get(i) - list.get(i+1));
            if(currDiff < minDiff) {
                minDiff = currDiff;
            }
        }
        return minDiff;
    }
}
