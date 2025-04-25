package com.review.queue;

public class Impl {
    public static void main(String[] args) {
        QueueUsingCircularArray<Integer> q1 = new QueueUsingCircularArray<>(4);

        q1.addQueue(10);
        q1.addQueue(20);
        q1.addQueue(30);
        q1.addQueue(50);
        q1.addQueue(40);

        q1.deleteQueue();


        q1.printQueue();
        System.out.println(q1.isFull());
        System.out.println(q1.isEmpty());
        System.out.println(q1.getFront());
        System.out.println(q1.getRear());
        System.out.println(q1.queueSearch(10));
    }
}
