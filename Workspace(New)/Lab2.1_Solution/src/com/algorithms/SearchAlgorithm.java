package com.algorithms;

public class SearchAlgorithm {

    public static boolean linearSearch(int target, int[] array){

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == target)
                return true;
        }
        return false;
    }
    public static boolean binarySearch(int target, int[] sortedArray){
        return sortedArray==null?false:binarySearch(target, sortedArray, 0, sortedArray.length-1);
    }

    private static boolean binarySearch(int target, int[] array, int start, int end){
        if (start<=end){
            int mid = (end-start)/2 + start;
            if (array[mid] == target){
                return true;
            }
            else if (array[mid] > target){
                return binarySearch(target, array, start, mid-1);
            }
            else{
                return binarySearch(target, array, mid+1, end);
            }
        }
        return false;
    }



    public static void main(String[] args){
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(SearchAlgorithm.linearSearch(7, sorted));
        System.out.println(SearchAlgorithm.linearSearch(0, sorted));
        System.out.println(SearchAlgorithm.binarySearch(7, sorted));
        System.out.println(SearchAlgorithm.binarySearch(0, sorted));
    }
}

