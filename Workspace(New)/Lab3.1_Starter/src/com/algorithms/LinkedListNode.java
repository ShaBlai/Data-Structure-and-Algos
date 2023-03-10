package com.algorithms;

import java.util.Optional;

public class LinkedListNode<V> {
    private V value;
    private LinkedListNode next;

    public LinkedListNode(V value, LinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public LinkedListNode<V> getNext() {
        return next;
    }

    public V getValue() {
        return value;
    }

    public LinkedListNode setValue(V value) {
        this.value = value;
        return this;
    }

    public LinkedListNode<V> setNext(LinkedListNode<V> next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "value=" + value +
                '}';
    }

}
