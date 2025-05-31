package com.Nk.GFG.Journey.Arrays;

public class FindMax {
    // Find largest element in array
    // https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        int largestElement = largest(arr); // store the method return the value
        System.out.println(largestElement); // print the ans
    }
    public static int largest(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
