package com.Nk.GFG.Journey.Day_4_RecursionAdvanced;

public class CheckArraySorted {
    // Check if array is sorted
    // https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arraySortedOrNot(arr));
    }
    static boolean arraySortedOrNot(int[] arr) {
        return sortedHelper(arr,0);
    }
    static boolean sortedHelper(int[] arr, int index){
        // base case
        if (index == arr.length-1) return true;
        // check current element greater than next one is not ascending
        if (arr[index]>arr[index+1]) return false;
        // recursive call
        return sortedHelper(arr,index+1);
    }
}
