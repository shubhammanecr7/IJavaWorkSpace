package com.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aabbcde";
        //1- using brute force
        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(str.charAt(i));
                break;
            }
        }

        //2- using map
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }

        //3- using array
        /*considering lower case string we make an array of 26 characters
         * and increment its index for each count and print element with count 1*/
        int[] charCount = new int[26];
        for (char c : str.toCharArray()) {
            int index = c - 'a';
            charCount[index]++;
        }

        for(int cnt : charCount) {
            if(cnt == 1){
                System.out.println((char) ('a' + cnt+1)); break;
            }
        }
    }
}