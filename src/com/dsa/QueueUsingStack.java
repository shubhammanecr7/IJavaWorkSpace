package com.dsa;

import java.util.Stack;

/**
 * implementation of queue using stacks
 */
class MyQueue {
    private final Stack<Integer> s1 = new Stack<>();
    private final Stack<Integer> s2 = new Stack<>();

    /**
     * offer method adds element at the front of queue
     */
    public void offer(int data) {
        s1.push(data);
    }

    /**
     * poll method removes and returns the element at the front of queue
     */
    public int poll() {
        if (s1.isEmpty() && s2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int pollElement = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return pollElement;
    }

    /**
     * peek method returns the element at the front of queue
     */
    public int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int peekElement = s2.peek();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return peekElement;
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println("peek : " + myQueue.peek());
        System.out.println("poll : " + myQueue.poll());
        System.out.println(STR."new peek : \{myQueue.peek()}");
    }
}