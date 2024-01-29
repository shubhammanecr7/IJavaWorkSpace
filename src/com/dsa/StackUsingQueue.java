package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private final Queue<Integer> q1 = new LinkedList<>();
    private final Queue<Integer> q2 = new LinkedList<>();

    /**
     * push method adds element to the top of stack
     */
    public void push(int data) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    /**
     * pop method removes and returns the element at the top of stack
     */
    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q1.poll();
    }

    /**
     * peek method returns the top of stack without removing it
     */
    public int peek() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q1.peek();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("peek " + myStack.peek());
        System.out.println("pop " + myStack.pop());
        System.out.println("new peek " + myStack.peek());
    }
}
