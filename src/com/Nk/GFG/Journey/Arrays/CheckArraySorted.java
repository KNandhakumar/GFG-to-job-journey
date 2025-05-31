package com.Nk.GFG.Journey.Arrays;

public class CheckArraySorted {
    // Check if array is sorted
    // https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        if (arraySortedOrNot(arr)){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
    static boolean arraySortedOrNot(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
