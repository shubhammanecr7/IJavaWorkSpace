package com.strings;

public class PrintSubStrings {
    public static void main(String[] args) {
        showSubStrings2("abc");
    }

    private static void showSubStrings(String s) {
        // TIP : always store the length in a variable so that we can avoid method calls
        // while looping.
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.println(s.substring(i, j + 1));
            }
        }
    }

    //a better approach using StringBuffer instead of subString() because this method will
    //create multiple copies of the strings each time in memory
    private static void showSubStrings2(String s) {
        // TIP : always store the length in a variable so that we can avoid method calls
        // while looping.
        int length = s.length();
        for (int i = 0; i < length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = i; j < length; j++) {
                sb.append(s.charAt(j));
                System.out.println(sb);
            }
        }
    }
}
