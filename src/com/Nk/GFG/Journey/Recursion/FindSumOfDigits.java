package com.Nk.GFG.Journey.Recursion;

public class FindSumOfDigits {
    // Sum of Digits of a Number Using Recursion
    // https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
    public static void main(String[] args) {
        int n = 12;
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n){
        // base case
        if (n==0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}
