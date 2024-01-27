package com.strings;

import java.util.Stack;

public class DecodeString394 {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        String decodeString = decodeString(s);
        System.out.println(decodeString);
    }

    private static String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numberStack = new Stack<>();
        int k = 0;
        for (char c : s.toCharArray()) {
            // if c is digit then store it in k till next opening bracket
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
                continue;
            }
            /* if c is opening bracket comes pusk digit value in k to numStack and push opening
            * bracket to stringStack*/
            if (c == '[') {
                numberStack.push(k);
                k = 0; //make k equal to 0 for next digit storing
                stringStack.push(String.valueOf(c));
                continue;
            }
            /* if c is not open/close bracket then that is character push it to stringStack*/
            if (c != ']') {
                stringStack.push(String.valueOf(c));
                continue;
            }

            /* if c is closing bracket store the string stack characters till open bracket
            * to temp string and when reach open bracket remove it*/
            StringBuilder temp = new StringBuilder();
            while (!stringStack.peek().equals("[")) {
                temp.insert(0, stringStack.pop());
            }

            //remove the [ bracket
            stringStack.pop();

            // after removing the open bracket we will repeat the temp string for count times
            // we can get count value for current temp string from numStack popping
            StringBuilder replacement = new StringBuilder();
            int count = numberStack.pop();
            for (int i = 0; i < count; i++) {
                replacement.append(temp);
            }

            //after repetition store the repeated string back to stack again
            stringStack.push(replacement.toString());
        }

        // after all parsing pop the stringStack to make final result string
        StringBuilder result = new StringBuilder();
        while (!stringStack.isEmpty()) {
            result.insert(0, stringStack.pop());
        }

        return result.toString();
    }
}
