package com.leetcode;

import java.util.Scanner;

public class OddEvenSpaced {
    // print then string even index and odd index characters

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] s = new String[size];
        for (int i = 0; i < s.length; i++){
            s[i] = sc.next();
        }
        String s1="";
        String s2="";
        for (String myStr : s){
            for (int i = 0; i<myStr.length(); i++) {
                if (i%2==0)
                    s1 += myStr.charAt(i);
                else
                    s2 += myStr.charAt(i);
            }
            System.out.println(s1+ " " +s2);
            s1="";s2="";
        }

    }
}
