package com.Nk.GFG.Journey.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastOccurrence {
    // First and Last Occurrence of an Element in a Sorted Array
    // https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67};
        int target = 5;
        System.out.println(find(arr,target));
    }
    // time complexity O(Log n)
    // space complexity O(1)
    static ArrayList<Integer> find(int[] arr, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int  first = firstOccurrence(arr,x);
        int last = lastOccurrence(arr,x);
        result.add(first);
        result.add(last);
        return result;
    }
    static int firstOccurrence(int[] arr,int x){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (x==arr[mid]){
                result = mid;
                end = mid-1;
            }
            else if (x>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return result;
    }
    static int lastOccurrence(int[] arr,int x){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (x==arr[mid]){
                result = mid;
                start = mid+1;
            }
            else if (x>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return result;
    }
}
