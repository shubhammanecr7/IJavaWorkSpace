package com.leetcode;

public class BinaryAddition {
    public static void main(String[] args) {
        String a = "111";
        String b = "111";
        // here  we are trying to perform the addition of 111+001=1000 (7+1=8)

        String result = addBinary(a, b);
        System.out.println(result);
    }

    /**
     * here for addition we always add from last digit to first digit
     * so we declare n1&n2 pointer to start pointing from last to first digit
     */
    private static String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;

        int carry = 0;
        int base = 2; // for binary addition only
        StringBuilder sb = new StringBuilder(); // for storing result

        while (n1 >= 0 || n2 >= 0) {
            int digit1 = 0;
            int digit2 = 0;
            int sum = 0;
            if (n1 >= 0) //extracting digits from last using n1 pointer for a string
                digit1 = a.charAt(n1--) - '0';
            if (n2 >= 0) //extracting digits from last using n2 pointer for b string
                digit2 = b.charAt(n2--) - '0';

            sum = digit1 + digit2 + carry; // finding sum of digits + carry
            if (sum >= base) { //if sum>=2 then we make carry 1 and sum 0 (1+1 sum=0 carry=1)
                carry = 1;
                sum -= base;
            } else {
                carry = 0;
            }
            sb.append(sum);
        }

        //now if carry after last two digit addition is remaining then we append it to result
        if (carry == 1) sb.append(carry);

        /**
        * now as we are storing addition in string builder from left to right but, we are
         * doing actual addition from right to left side so at last we must return
         * reversed result as output*/

        return sb.reverse().toString();
    }
}
