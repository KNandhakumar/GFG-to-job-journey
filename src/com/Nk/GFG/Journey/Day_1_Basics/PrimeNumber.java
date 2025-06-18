package com.Nk.GFG.Journey.Day_1_Basics;

public class PrimeNumber {
    // check prime number
    // https://www.geeksforgeeks.org/problems/prime-number-validation-java-regex0450/1
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPrime(n));
    }
    public static int isPrime(int N) {
        if (N<=1){
            return 0;
        }
        for (int i = 2; i <N-1 ; i++) {
            if (N%i==0){
                return 0;
            }
        }
        return 1;
    }
}
