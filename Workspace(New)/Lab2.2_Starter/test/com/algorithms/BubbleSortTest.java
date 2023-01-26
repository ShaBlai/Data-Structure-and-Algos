package com.algorithms;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;


public class BubbleSortTest {
    /*
    success path(s)
        non-empty non-null unsorted array sorted in correct order
    failure path(s)
        empty array
        null array
     */
    @Test
    public void sortPositive() {
     int[] testArray = {3,7,2,15,8,4,6};
     int[] expectedTestArray = {3,7,2,15,8,4,6};

     BubbleSort.sort(testArray);
     Arrays.sort(expectedTestArray);

     assertArrayEquals(expectedTestArray, testArray);


    }

    @Test
    public void sortNullArrayPositive() {
        int[] testArray = null;
        int[] expectedTestArray = null;

        BubbleSort.sort(testArray);
        Arrays.sort(expectedTestArray);

        assertArrayEquals(expectedTestArray, testArray);

    }

    @Test
    public void sortEmptyArrayPositive() {

    }


}