
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
        // TODO-Lab2.2: implement pseudo-code

        if (numbers == null)
            return;
        boolean swap = false;
        int count = 0;
        do{
            swap = false;
            for(int i = 0; i < numbers.length - 1; i++){
                if(numbers[i] > numbers[i + 1]){
                    swap = true;
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                }
                count++;
            }

        } while (swap==true);


        System.out.println("Iterations for array of length " + numbers.length + ": "+ count);

    }

}
