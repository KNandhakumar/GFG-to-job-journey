package com.Nk.GFG.Journey.Day_1_Basics;

public class ReverseNumber {
    // Reverse digits
    // https://www.geeksforgeeks.org/problems/reverse-digit0316/1
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverseDigits(n));
    }
    public static int reverseDigits(int n) {
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        return reverse;
    }
}
