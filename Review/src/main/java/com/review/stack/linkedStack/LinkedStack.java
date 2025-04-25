package com.review.stack.linkedStack;

public class LinkedStack<T> {
    Node<T> top;

    public LinkedStack() {
        this.top = null;
    }

    public void push(T newItem){
        Node<T> newItemPtr;
        newItemPtr = new Node<>(newItem);
        newItemPtr.next = top;
        top = newItemPtr;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T poppedData = top.item;
        top = top.next;
        return poppedData;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }




    public boolean isEmpty(){
        return top == null;
    }
}
