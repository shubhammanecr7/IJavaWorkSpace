package com.strings;

import java.util.Arrays;

public class SortStringAlphabetically {
    /*Sort string characters in alphabetical order*/
    public static void main(String[] args) {
        String str = "fedcba";
        //1 - without using sort method
        char[] ch = str.toCharArray();
        char temp;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] > ch[j]){
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println(new String(ch));

        //2 - using sort method
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
