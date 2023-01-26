package com.algorithms;

import java.util.Optional;

public class LinkedListNode {
    private int value;
    private LinkedListNode next;

    public LinkedListNode(int value, LinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public LinkedListNode setValue(int value) {
        this.value = value;
        return this;
    }

    public LinkedListNode setNext(LinkedListNode next) {
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
