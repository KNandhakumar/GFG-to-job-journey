package com.Nk.GFG.Journey.Arrays;

public class RecursiveBSDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2};
        int target = 1;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        // base case
        if (start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target==arr[mid]){
            int left = search(arr,target,start,mid-1);
            return (left!=-1) ? left : mid;
        }
        else if (target>arr[mid]){
            return search(arr,target,mid+1,end);
        }
        else {
            return search(arr,target,mid-1,end);
        }
    }
}
