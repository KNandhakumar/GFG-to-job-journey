package com.Nk.GFG.Journey.Day_3_Recursion;

public class ReverseDigits {
    // Reverse Digits
    // https://www.geeksforgeeks.org/problems/reverse-digit0316/1
    public static void main(String[] args) {
        int n = 12345;
        int reverse = 0;
        System.out.println(reverseDigits(n,reverse));
    }
    public static int reverseDigits(int n,int reverse) {
        if (n==0) return reverse;
        return reverseDigits(n/10,reverse*10 + n%10);
    }
}
