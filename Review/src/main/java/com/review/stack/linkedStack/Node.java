package com.review.stack.linkedStack;

public class Node<T> {
    T item;
    Node<T> next;

    public Node(T item) {
        this.item = item;
        this.next = null;
    }
}
