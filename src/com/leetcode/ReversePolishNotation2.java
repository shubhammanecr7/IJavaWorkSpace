package com.leetcode;

import java.util.Stack;

public class ReversePolishNotation2 {
    public static void main(String[] args) {
        String[] s = {"2", "1", "+", "3", "*"};

        evalRPN(s);
    }

    private static void evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if ("+-*/".contains(s)) {
                stack.push(calculationOf(stack.pop(), stack.pop(), s));
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        //final result is present at the top of the stack
        System.out.println(stack.pop());
    }

    private static int calculationOf(int b, int a, String operator) {

        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case null, default -> a / b;
        };
    }
}
