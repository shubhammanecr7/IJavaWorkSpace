package com.strings;

public class ReplaceCharOccurrence {
    public static void main(String[] args) {
        String s = "open text";
        char charToReplace = 't';

        //first we check if the given character is present in string or not
        //else we need not go for replacement with occurrence number
        if (s.indexOf(charToReplace) == -1) {
            System.out.println("Given character not present in string");
            System.exit(0);
        }

        //1- using char array
        StringBuilder sb = new StringBuilder();
        int occurrence = 1;
        for (char c : s.toCharArray()) {
            if (c == charToReplace)
                sb.append(occurrence++);
            else
                sb.append(c);
        }
        System.out.println(sb);

        //2- using replaceFirst() method of string
        int cnt = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == charToReplace) {
                s = s.replaceFirst(String.valueOf(ch), String.valueOf(cnt));
                cnt++;
            }
        }
        System.out.println(s);
    }

}
