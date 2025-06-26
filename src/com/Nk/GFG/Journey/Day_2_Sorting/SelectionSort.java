package com.Nk.GFG.Journey.Day_2_Sorting;

import java.util.Arrays;

public class SelectionSort {
    // Selection sort
    // https://www.geeksforgeeks.org/problems/selection-sort/1
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        selectionSort(arr);
    }
    static void selectionSort(int[] arr) {
        // find min index first using outer loop
        for (int i = 0; i < arr.length-1; i++) {
            int midIndex = i;
            // find which one is minimum in this inner loop
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[midIndex]){
                    midIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
