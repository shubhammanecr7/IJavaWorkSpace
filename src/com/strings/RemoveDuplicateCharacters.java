package com.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        /* four different ways to remove duplicate characters from string*/
        //1 - using chars() and distinct IntStream function
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println(sb1);

        //2 - using indexOf() method
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            int index = str.indexOf(ch , i+1);
            if (index == -1) {
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

        //3 - brute force
        StringBuilder sb3 = new StringBuilder();
        char[] ch = str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            boolean repeated = false;
            for (int j = i+1; j < str.length(); j++) {
                if (ch[i] == ch[j]){
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                sb3.append(ch[i]);
            }
        }
        System.out.println(sb3);

        //4 - using set
        Set<Character> characterSet = new HashSet<>();
        for (char c : str.toCharArray()) characterSet.add(c);

        StringBuilder sb4 = new StringBuilder();
        for (char c : characterSet) sb4.append(c);
        System.out.println(sb4);
    }
}
