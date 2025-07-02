package com.Nk.GFG.Journey.Day_3_Recursion;

public class SumOfDigits {
    // Sum Of Digits
    // https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
    public static void main(String[] args) {
        int n = 678;
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n) {
        // base case
        if (n==0) return 0;
        // recursive call
        return (n%10) + sumOfDigits(n/10);
    }
}
