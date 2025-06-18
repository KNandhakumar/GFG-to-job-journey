package com.Nk.GFG.Journey.Day_1_Basics;

public class FibonacciNumber {
    // Fibonacci
    // https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
    public static void main(String[] args) {
        int n = 5;
        System.out.println(nthFibonacci(n));
    }
    public static int nthFibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n==0) return 0;
        else if(n==1) return 1;
        else {
            for (int i = 1; i < n; i++) {
                int sum = a+b;
                a = b;
                b = sum;
            }
        }
        return b;
    }
}
