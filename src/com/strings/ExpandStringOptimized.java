package com.strings;

public class ExpandStringOptimized {
    public static void main(String[] args) {
        String s = "13[a]2[bc]";
        expand(s);
    }

    private static void expand(String s) {
        StringBuilder output = new StringBuilder();
        int i=0;
        while ( i<s.length() ) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int num = 0;
                //extract complete number
                while(Character.isDigit(s.charAt(i))){
                    num = num*10 + (s.charAt(i) - '0');
                    i++;
                }

                //move i  to the next character in the string ie '['
                i++;

                //extract the substring to repeat
                StringBuilder temp = new StringBuilder();
                int openBracket = 1;
                while(openBracket > 0){
                    char current = s.charAt(i);
                    //if current is opening bracket increment the open bracket counter
                    if (current == '[') openBracket++;
                    //if current is closing bracket increment the close bracket counter
                    else if (current == ']') openBracket--;

                    /**
                     * if current char is not opening/closing bracket and openBracket
                     * count is more than 1 then it must be a letter, so we append it to temp*/
                    if (openBracket > 0) temp.append(s.charAt(i));

                    // after every condition check increment i
                    i++;
                }
                for(int k=0 ; k<num ; k++) {
                    output.append(temp);
                }
            }else {
                output.append(ch);
                i++;
            }
        }
        System.out.println(output.toString());
    }
}
