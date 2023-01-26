package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchAlgorithmTest {
    // TODO-Lab2.1/2.2: Implement tests

    @Test
    public void binarySearchTarget() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7,};
        int target = 3;
        boolean expected = true;
        boolean actual = SearchAlgorithm.binarySearch(target, numbers);

        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchNotFound() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7,};
        int target = 8;
        boolean expected = false;
        boolean actual = SearchAlgorithm.binarySearch(target, numbers);

        assertEquals(expected, actual);
    }

}