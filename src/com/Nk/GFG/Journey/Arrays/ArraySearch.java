package com.Nk.GFG.Journey.Arrays;

public class ArraySearch {
    // Linear search -> Search for target by checking each element
    // https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
    public static void main(String[] args) {
        int[] arr = {10, 8, 30, 4, 5};
        int target = 4;
        System.out.println(search(arr,target));
    }
    // time complexity -> bigO(n)
    // space complexity -> bigO(1)
    static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
           if (x==arr[i]){
               return i;
           }
        }
        return -1;
    }
}
