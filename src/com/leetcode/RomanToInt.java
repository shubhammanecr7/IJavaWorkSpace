package com.leetcode;

public class RomanToInt {
    public static void main(String[] args) {
        String s= "XIX";

        int num = romanToInt(s);
        System.out.println(num);
    }

    private static int romanToInt(String s) {
        int sum =0;
        int cur = translate(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = translate(s.charAt(i));
            if (cur < next) sum -= cur;
            else sum += cur;
            cur = next;
        }
        sum += cur;
        return sum;
    }

    // used enhanced switch statement
    private static int translate(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
