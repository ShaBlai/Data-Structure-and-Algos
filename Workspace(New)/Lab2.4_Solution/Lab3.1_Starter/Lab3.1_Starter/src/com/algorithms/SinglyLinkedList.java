package com.algorithms;

import java.util.Optional;

public class SinglyLinkedList {
    private LinkedListNode head;
    public SinglyLinkedList() {

        head = null;
    }

    public void addFront(int item) {

        this.head = new LinkedListNode(item, head);
    }

    public void appendToList(int item){
        // TODO-Lab3.1: Code out appendToList from pseudoCode completed


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



    }

    public LinkedListNode getHead(){
        return head;
    }

    public void reverseRecursively(){
        // TODO-Lab3.1: Invoke private method with proper arguments



    }

    private void reverse(LinkedListNode node){
        // TODO-Lab3.1: Implement logic here




    }

    public int traverseList(boolean print){
        int count = 0;
        LinkedListNode curNode = getHead();
        while(curNode!=null){
            if(print) {
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
        while(cur != null){
            builder.append(cur);
            builder.append("\n");
            LinkedListNode next = cur.getNext();
            if(next!=null){
                cur = next;
            }
            else{
                cur = null;
            }
        }
        return builder.toString();
    }
}

class MainTest{
    public static void main(String[] args) {
        SinglyLinkedList intExample = new SinglyLinkedList();
        intExample.addFront(6);
        intExample.addFront(23);

        System.out.println(intExample);

        intExample.appendToList(4);
        System.out.println(intExample);

    }
}
