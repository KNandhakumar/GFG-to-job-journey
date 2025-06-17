package com.Nk.GFG.Journey.Day_1_Basics;

public class FindPalindrome {
    // Palindrome
    // https://www.geeksforgeeks.org/problems/palindrome0746/1
    public static void main(String[] args) {
        int n= 123;
        if (isPalindrome(n)){
            System.out.println("this is palindrome number");
        }
        else {
            System.out.println("not palindrome");
        }
    }
    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n>0){
            int remainder = n%10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }
        return original == reverse;
    }
}
