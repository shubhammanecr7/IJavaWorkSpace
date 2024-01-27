package com.strings;

import java.util.HashSet;
import java.util.Set;

public class PangramString {
    public static void main(String[] args) {
        System.out.println(isPangram2("the quick brown fox jumps over a lazy dog"));
        System.out.println(isPangram1("the quick brown fox jumps over a lazy dog"));
        System.out.println(isPangram3("the quick brown fox jumps over a lazy dog"));
    }

    private static boolean isPangram3(String s) {
        boolean[] result = new boolean[26];
        int index;
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                index = c - 'A';
            } else if (c >= 'a' && c <= 'z') {
                index = c - 'a';
            } else {
                continue;
            }
            result[index] = true;
        }
        for (boolean isTrue : result) {
            if (!isTrue) {
                return false;
            }
        }

        return true;
    }


    /**
     * this is an optimized version used to check if given string is pangram or not
     * here we have used Set for more clear and easy to understand approach
     */
    private static boolean isPangram1(String s) {
        Set<Character> set = new HashSet<Character>();
        for (Character c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                set.add(Character.toUpperCase(c));
            }
        }
        return set.size() == 26;
    }

    private static boolean isPangram2(String s) {
        boolean[] result = new boolean[26];
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                int index = c - 'A';
                result[index] = true;
            }
        }
        for (boolean isTrue : result) {
            if (!isTrue) {
                return false;
            }
        }
        return true;
    }
}