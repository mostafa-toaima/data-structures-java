package com.review.linkedStack;

public class TestLinkedStack {
    public static void main(String[] args) {
        LinkedStack<Integer> s = new LinkedStack<>();
        s.push(100);
        s.push(200);
        s.push(300);

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.display();
    }
}
