package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchAlgorithmTest {
    // TODO-Lab2.2: Implement tests
    @Test
    public void binarySearchTarget(){
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target =4;
        boolean expected = true;

        boolean actual = SearchAlgorithm.binarySearch(target, sorted);

        assertEquals(expected, actual);

    }

    @Test
    public void binarySearchNotFound(){
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target =24;

        boolean expected = false;
        assertEquals(expected, SearchAlgorithm.binarySearch(target, sorted));
    }


}