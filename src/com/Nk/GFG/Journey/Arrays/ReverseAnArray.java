package com.Nk.GFG.Journey.Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    // Reverse an array
    // https://www.geeksforgeeks.org/problems/reverse-an-array/1
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
    }
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
