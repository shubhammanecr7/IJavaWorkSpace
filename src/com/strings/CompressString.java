package com.strings;

public class CompressString {
    public static void main(String[] args) {
        String s = "aaabbccdsa";
//      compress(s);
        int res =  compressCharArray(s.toCharArray());
        System.out.println(res);
    }

    /**
     * here we can use the same array for the result storing*/
    private static int compressCharArray(char[] chars) {
        int index=0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int count = 1;

            //count the characters for more than one count
            while(i+1 < chars.length && chars[i] == chars[i+1]) {
                count++; i++;
            }

            chars[index++] = ch;
            if (count > 1){
                char[] countArray = String.valueOf(count).toCharArray();
                for (char cnum : countArray){
                    chars[index++] =cnum;
                }
            }
        }
        return index;
    }

    private static void compress(String s) {
        StringBuilder output = new StringBuilder();
        int i=0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 1;
            while (i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                count++; i++;
            }
            output.append(ch);
            if (count > 1 ){    // append count only if > 1
                output.append(count);
            }
            i++;
        }

        System.out.println(output);
    }
}
