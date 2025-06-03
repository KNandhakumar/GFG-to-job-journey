package com.Nk.GFG.Journey.SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    // Insertion sort
    // https://www.geeksforgeeks.org/problems/insertion-sort/1
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        insertionSort(arr);
    }
    // time complexity O(n2)
    // space complexity O(1)
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
