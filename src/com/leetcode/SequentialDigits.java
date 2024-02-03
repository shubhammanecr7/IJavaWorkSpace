package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        List<Integer> list = sequentialDigits(low, high);
        System.out.println(list);
    }

    private static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            //solve(num , currentDigit , low , high , list)
            //(1,1,low,high,list),(2,2,low,high,list),(3,3,low,high,list)
            solve(i, i, low, high, al);
        }
        Collections.sort(al);
        return al;
    }

    private static void solve(int num, int currentDigit, int low, int high, List<Integer> al) {
        //if current number in range of low and high
        if (num >= low && num <= high) al.add(num);
        //if number > high or digit >9 we must stop
        if (num > high || currentDigit >= 9) return;
        solve((num * 10) + (currentDigit + 1), currentDigit + 1, low, high, al);
    }
}