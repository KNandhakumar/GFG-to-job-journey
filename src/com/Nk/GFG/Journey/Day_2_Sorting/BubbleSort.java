package com.Nk.GFG.Journey.Day_2_Sorting;

import java.util.Arrays;

public class BubbleSort {
    // Bubble Sort
    // https://www.geeksforgeeks.org/problems/bubble-sort/1
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
