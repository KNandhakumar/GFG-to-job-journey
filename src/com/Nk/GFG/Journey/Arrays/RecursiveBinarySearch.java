package com.Nk.GFG.Journey.Arrays;

public class RecursiveBinarySearch {
    // Recursive binary search
    // https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2};
        int target = 1;
        System.out.println(recursiveSearch(arr,target,0,arr.length-1));
    }
    static int recursiveSearch(int[] arr,int target,int start,int end){
        // base case
        if (start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target==arr[mid]){
            return mid;
        }
        else if (target>arr[mid]){
            return recursiveSearch(arr,target,mid+1,end);
        }
        else {
            return recursiveSearch(arr,target,start,mid-1);
        }
    }
}
