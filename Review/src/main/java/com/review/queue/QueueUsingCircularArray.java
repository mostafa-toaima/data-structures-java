package com.review.queue;

public class QueueUsingCircularArray<T> {
    private final int maxSize;
    private int rear;
    private int front;
    private int length;
    private final T[] arr;

    @SuppressWarnings("unchecked")
    public QueueUsingCircularArray(int size) {
        this.maxSize = size > 0 ? size : 100;
        front = 0;
        rear = maxSize - 1;
        length = 0;
        arr = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == maxSize;
    }

    public void addQueue(T element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % maxSize;
            arr[rear] = element;
            length++;
        }
    }

    public void deleteQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            front = (front + 1) % maxSize;
            length--;
        }
    }

    public T getFront() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return arr[front];
    }

    public T getRear() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return arr[rear];
    }

    public void printQueue() {
        if (!isEmpty()) {
            int count = 0;
            int i = front;
            while (count < length) {
                System.out.println(arr[i]);
                i = (i + 1) % maxSize;
                count++;
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    public int queueSearch(T element) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int i = front;
        int count = 0;
        while (count < length) {
            if (arr[i].equals(element)) {
                return count; // position in queue, not index
            }
            i = (i + 1) % maxSize;
            count++;
        }

        return -1; // not found
    }
}
