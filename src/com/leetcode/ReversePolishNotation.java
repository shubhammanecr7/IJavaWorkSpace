package com.leetcode;

import java.util.Stack;

public class ReversePolishNotation {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        String[] s={"2","1","+","3","*"};

        evaluateRPN(s);
    }

    private static void evaluateRPN(String[] tokens) {
        for (String s : tokens){
            if (isNumeric(s)){
                stack.push(Integer.parseInt(s));
            }else {
                int result =  doOperation(s);
                stack.push(result);
            }
        }
        // the total result will be present at top of stack
        System.out.println(stack.pop());
    }

    public static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (Exception e){
            System.out.println("Operator found : " + str);
            return false;
        }
    }

    public static int doOperation(String operator){
        int a = stack.pop();
        int b = stack.pop();
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}
