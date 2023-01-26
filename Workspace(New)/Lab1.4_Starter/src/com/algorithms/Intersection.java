package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

	public List<Integer> intersectionFast(int[]a, int[]b){
		// TODO-Lab1.4: Implement fast intersection logic here
        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> intersection = new LinkedList<>();

        int indexA = 0;
        int indexB = 0;

        while (indexA < a.length && indexB < b.length) {
            int valueA = a[indexA];
            int valueB = b[indexB];

            if (valueA == valueB) {
                intersection.add(valueA);
                indexA++;
                indexB++;
            } else if (valueA < valueB) {
                indexA++;
            } else if (valueA > valueB) {
                indexB++;
            }
        }
        return intersection;
	}

    public static void main(String args[]) {
        Intersection simpleIntersection = new Intersection();
        System.out.println(simpleIntersection.intersectionFast(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        System.out.println();
    }
}
