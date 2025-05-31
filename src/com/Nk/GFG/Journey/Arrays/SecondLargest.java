package com.Nk.GFG.Journey.Arrays;

public class SecondLargest {
    // Find the second largest element in an array
    // https://www.geeksforgeeks.org/problems/second-largest3735/1
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest : " + getSecondLargest(arr));
    }
    static int getSecondLargest(int[] arr) {
        // initialize both variables to negative values
        int firstLargest = -1;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
