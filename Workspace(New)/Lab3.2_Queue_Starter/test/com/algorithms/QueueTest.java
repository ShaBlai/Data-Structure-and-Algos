package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    // TODO-Lab2.6: create a Queue test fixture reference
    Queue<Customer> queue = null;
    @Before
    public void setUp() throws Exception {
        // TODO-Lab2.6: instantiate the queue test fixture
        queue = new Queue<>();
        // TODO-Lab2.6: populate with one customer object
        queue.enqueue(new Customer(12345, "Eric Flores", 212));
    }

    // TODO-Lab2.6: design and implement positive and negative tests and give them decent names

    @Test
    public void enqueueTest() {
        String expected = "Eric Flores";
        String expected2 = "Wale Salami";

        Customer cust = new Customer(23456, expected2, 345);
        queue.enqueue(cust);
        String actual = queue.dequeue().getName();
        assertEquals(expected, actual);
        actual = queue.dequeue().getName();
        assertEquals(expected2, actual);

    }

    @Test
    public void dequeueTest() {
        String expected = new Customer(12345, "Eric Flores", 212).toString();
        String actual = queue.dequeue().toString();

        assertEquals(expected.toString(), actual);

    }

    public void emptyListTest(){

        //expected and actual should both be null.
        assertNull();
    }
}