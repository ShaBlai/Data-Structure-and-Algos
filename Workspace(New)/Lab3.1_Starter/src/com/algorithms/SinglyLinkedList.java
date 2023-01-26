package com.algorithms;

import java.util.Optional;

public class SinglyLinkedList<V> {
    private LinkedListNode<V> head;

    public SinglyLinkedList() {

        head = null;
    }

    public void addFront(V item) {

        this.head = new LinkedListNode<V>(item, head);
//        if (head == null) {
//            LinkedListNode newNode = new LinkedListNode(item, null);
//            this.head = newNode;
//        } else {
//            LinkedListNode newNode = new LinkedListNode(item, head);
//            this.head = newNode;
//        }

    }

    public void appendToList(V item) {
        // TODO-Lab3.1: Code out appendToList from pseudoCode completed
        //declare newNode with item and next
        //check if the linkedlist is empty (if head == null)

        //empty
        // new node becomes the new head

        //not empty
        //traverse to the end of the list(make sure you stop at the last node and not the null of the last node with iteration)
        //set last node's next to newNode
        LinkedListNode <V> newNode = new LinkedListNode(item, null);

        LinkedListNode <V> pointer = this.head;

        if (head == null) {
            this.head = newNode;
        } else {
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(newNode);
        }

    }

    public void deleteFront() {
        // TODO-Lab3.1: Code out deleteFront from pseudoCode provided

        /*
            can only delete if LinkedList is not empty.
            --> if not empty
                    1. LinkedList has more than one node in the list
                    --> save head.next (the new head node)
                    --> set head.next to null
                    --> set node to head
                    2. LinkedList has only one node in the list
                    --> set head to null

         */

        LinkedListNode<V> headnode = this.head;
        if (headnode != null) {
            LinkedListNode<V> node = head.getNext();
            if (node != null) {
                this.head.setNext(null);
                this.head = node;
            } else {
                this.head = null;
            }
        }

    }

    public LinkedListNode getHead() {
        return head;
    }

    public void reverseRecursively() {
        // TODO-Lab3.1: Invoke private method with proper arguments
        reverse(head);

    }

    private void reverse(LinkedListNode node) {
        // TODO-Lab3.1: Implement logic here

        if (node == null) {
            return;
        }
        reverse(node.getNext());

        System.out.println(node.getValue());
    }

    public int traverseList(boolean print) {
        int count = 0;
        LinkedListNode curNode = getHead();
        while (curNode != null) {
            if (print) {
                System.out.println(curNode.toString());
            }
            curNode = curNode.getNext();
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LinkedListNode cur = head;
        while (cur != null) {
            builder.append(cur);
            builder.append("\n");
            LinkedListNode next = cur.getNext();
            if (next != null) {
                cur = next;
            } else {
                cur = null;
            }
        }
        return builder.toString();
    }
}

class MainTest {
    public static void main(String[] args) {
        SinglyLinkedList intExample = new SinglyLinkedList();

        intExample.addFront(6);
        intExample.addFront(23);

        System.out.println(intExample);

        intExample.appendToList(4);
        System.out.println(intExample);

        intExample.reverseRecursively();

        intExample.deleteFront();
        System.out.println(intExample);

    }
}
