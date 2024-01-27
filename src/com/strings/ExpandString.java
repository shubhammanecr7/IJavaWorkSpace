package com.strings;

public class ExpandString {
    public static void main(String[] args) {
        String s = "as3(ab)4(cd)";
        expandString(s);
    }

    /**
     * expandString() method will only work if string starts with digit first
     */
    private static void expandString(String s) {
        StringBuffer output = new StringBuffer();
        int i,j,k;
        for(i = 0 ; i<s.length(); i++) { //loop for parsing string
            char ch = s.charAt(i);
            int num = ch - '0'; //extracting number
            StringBuffer temp = new StringBuffer();
            for (j=i+2; s.charAt(j) != ')' ; j++){ //loop for getting letters between ()
                temp.append(s.charAt(j));
            }
            for(k=1 ; k<=num ; k++) { //loop for adding temp word for given times
                output.append(temp);
            }
            i=j;
        }
        System.out.println(output);
    }
}