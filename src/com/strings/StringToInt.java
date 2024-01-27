package com.strings;

public class StringToInt {
    public static void main(String[] args) {
        int result = convertToInt("-91283472332");
        System.out.println(result);
    }

    private static int convertToInt(String s) {
        int i=0; int sign=1;
        long result = 0;
        if(s.charAt(i) == '-'){ // handle - sign in string
            sign = -1;
            i++; // we skip the minus sign if present
        }
        if (s.charAt(i) == '+'){ // handle + sign in string
            i++;
        }
        while(i < s.length()){
            char c = s.charAt(i);
            int digit = c - 48;
            if(digit < 0 || digit > 9) break;
            result = result*10 + digit;
            if (sign == -1){
                if (-result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int) (result*sign);
    }
}