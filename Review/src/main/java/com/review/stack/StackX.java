package com.review.stack;

public class StackX {

    private int top;
     private int [] data;
    private int maxSize;

    public StackX(int maxSize) {
        this.top = -1;
        this.data = new int[maxSize];
        this.maxSize = maxSize;
    }

    public void push(int newValue){
//      this.data[++top] = newValue;
        top++;
        this.data[top] = newValue;
    }

    public int peek(){
        return data[top];
    }

    public int pop(){
//        int valueRemoved = data[top];
//        top--;
//        return valueRemoved;
        return data[top--];
    }

    public boolean isFull(){
        return top == maxSize-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

}
