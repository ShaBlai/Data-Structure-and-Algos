
package com.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] input = {4, 15, 2, 6, 9, 22, 13};
        System.out.println(Arrays.toString(input));
        sort(input);
        System.out.println(Arrays.toString(input));
    }


    public static void sort(int[] numbers){
        // TODO-Lab2.1: implement pseudo-code above
        if(numbers == null){
            System.out.println("The input array is empty");
            return;}
        int n = numbers.length;
        int count = 0;
        for(int k = 1; k < n; k++){
            for(int j = 0; j < (numbers.length -1); j++){
                count++; // O(n^2)
                if(numbers[j] > numbers[j+1]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
        System.out.println("Iterations for array of length " + numbers.length + ": "+ count);

    }

}
