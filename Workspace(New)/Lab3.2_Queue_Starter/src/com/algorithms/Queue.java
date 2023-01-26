package com.algorithms;

import java.util.Optional;

public class Queue<V> {
    // DblLinkedListNode is provided
    // create a private Node for "head"
    // create a private Node for "tail"
    private DblLinkedListNode<V> head;
    private DblLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(V item) {
        // add an item to the queue
        // TODO-Lab2.6: Implement the logic below


    }

    public V dequeue() {
        // get and remove an item from the queue
        // TODO-Lab2.6: Implement the dequeue function below

    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("one");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("two");
        q.enqueue("three");
        System.out.println("2 values added to queue");
        System.out.println("Now try to remove both values");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("\nAll values removed, try to remove another");
        System.out.println(q.dequeue());
        System.out.println("\nQueue should be empty now, add a new item");
        q.enqueue("four");
        System.out.println("\nNow remove the one item");
        System.out.println(q.dequeue());
        System.out.println("\nAll items should be gone, try to remove one");
        System.out.println(q.dequeue());
    }
}
