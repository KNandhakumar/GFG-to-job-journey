package com.Nk.GFG.Journey.SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    // Selection sort
    // https://www.geeksforgeeks.org/problems/selection-sort/1
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        selectionSort(arr);
    }
    // time complexity O(n2)
    // space complexity O(1)
    static void selectionSort(int[] arr) {
        // track min index for this loop
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            // find which on is minimum in this loop
            for (int j = i; j <arr.length ; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
