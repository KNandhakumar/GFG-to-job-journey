package com.Nk.GFG.Journey.Recursion;

public class Factorial {
    // Factorial
    // https://www.geeksforgeeks.org/problems/factorial5739/1
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    static int factorial(int n) {
        // base case
        if (n==1){
            return 1;
        }
        return n* factorial(n-1);
    }
}
