package com.algorithms;

public class SearchAlgorithm {

    public static boolean linearSearch(int target, int[] array) {
        // TODO-Lab2.1.A: Implement Linear search logic.
        boolean found = false;
        int position = -1;
        int index = 0;

        while (!found && index < array.length) {
            if (array[index] == target) {
                found = true;
            }
            index++;
        }
        return found;
    }

    public static boolean binarySearch(int target, int[] sortedArray) {
        return sortedArray == null ? false : binarySearch(target, sortedArray, 0, sortedArray.length - 1);
    }

    private static boolean binarySearch(int target, int[] array, int start, int end) {

        // TODO-Lab2.2.B: Implement binary search logic here using recursion
        if(start <= end){
            int mid = (end-start) / 2 + start;
            if(array[mid] == target){
                return true;
            } else if(array[mid] > target){
                return binarySearch(target, array, start, mid-1);
            } else{
                return binarySearch(target, array, mid+1, end);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(SearchAlgorithm.linearSearch(7, sorted));
        System.out.println(SearchAlgorithm.linearSearch(0, sorted));

        System.out.println(SearchAlgorithm.binarySearch(4, sorted));
        System.out.println(SearchAlgorithm.binarySearch(0, sorted));

    }
}