package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {
    SinglyLinkedList<Customer> custList = null;

    @Before
    public void setup() {
        //SinglyLinkedList<Customer> custList1;
        custList = new SinglyLinkedList<>();
        custList.addFront(new Customer(12345, "Andrew Smith", 255));
        custList.addFront(new Customer(23456, "Betty Smith", 355));
        custList.addFront(new Customer(34567, "Charlie Smith", 455));
        custList.addFront(new Customer(45678, "Dora Smith", 555));
        custList.addFront(new Customer(56789, "Edward Smith", 655));
        custList.addFront(new Customer(67890, "Francie Smith", 755));
        custList.addFront(new Customer(78901, "Gregory Smith", 855));
    }

    // TODO-Lab2.5: design and implement "addFront" tests if time permits

    @Test
    public void deleteFrontPositive() {

         }

    @Test
    public void sizePositive() {

    }

    @Test
    public void getHeadPositive() {

       }

    @Test
    public void reverseRecursivelyPositive() {
        // note: this is not a true test, just calling the method to see output
        custList.reverseRecursively();
    }

    @Test
    public void traverseListPositive() {

    }

    @Test
    public void toStringPositive() {
        // TODO-Lab2.5: implement this test if time permits

    }

}