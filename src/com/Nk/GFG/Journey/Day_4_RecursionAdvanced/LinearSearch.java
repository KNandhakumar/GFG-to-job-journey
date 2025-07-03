package com.Nk.GFG.Journey.Day_4_RecursionAdvanced;

public class LinearSearch {
    // Linear search with recursion
    // https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int x) {
        return searchHelper(arr,x,0);
    }
    static int searchHelper(int[] arr,int target,int index){
        // base case
        if (index == arr.length) return -1;
        if (target == arr[index]) return index;
        return searchHelper(arr,target,index+1);
    }
}
