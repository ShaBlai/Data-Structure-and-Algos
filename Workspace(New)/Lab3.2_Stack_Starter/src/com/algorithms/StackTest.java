package com.algorithms;
import java.util.*;

public class StackTest {

    public static void main(String[] args){
        Stack<Customer> customerStack = new Stack<>();

        customerStack.push(new Customer(876, "Robert Tai", 1010));
        System.out.println(customerStack.pop().toString());
    }
}
