package com.Nk.GFG.Journey.Recursion;

public class ReverseDigits {
    // Reverse digits
    // https://www.geeksforgeeks.org/problems/reverse-digit0316/1
    public static void main(String[] args) {
        int n = 122;
        System.out.println(reverseDigits(n));
    }
    static int reverseDigits(int n) {
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        return reverse;
    }
}
