package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    // TODO-Lab2.4: Implement the tests
    @Test
    public void mergeSortComplete(){
        int[] unsortedArray = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        int[] sortedArray = new int[]{1, 3, 4, 5, 16, 17, 21, 33};

        MergeSort merger = new MergeSort();
        merger.mergeSort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);

    }

}