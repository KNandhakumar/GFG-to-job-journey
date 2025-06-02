package com.Nk.GFG.Journey.Arrays;

public class BinarySearch {
    // Binary Search -> Fast search in sorted array
    // https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
    public static void main(String[] args) {
//        int[] arr = {11, 22, 33, 44, 55};
        int[] arr = {1, 1, 1, 1, 2}; // Find from duplication values
        int target = 1;
        System.out.println(binarySearch(arr,target));
    }
    // time complexity -> Best case O(1), Average O(log n), Worst O9log n)
    // space complexity -> O(1)
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                result = mid;
                end = mid-1;
            }
            if (target>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return result;
    }
}
