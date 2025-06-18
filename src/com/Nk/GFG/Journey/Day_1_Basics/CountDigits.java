package com.Nk.GFG.Journey.Day_1_Basics;

public class CountDigits {
    // Count Digits
    // https://www.geeksforgeeks.org/problems/count-digits-1606889545/1
    public static void main(String[] args) {
        int n = 5534;
        System.out.println(countDigits(n));
    }
    public static int countDigits(int n) {
        int count = 0;
        if (n==0){
            count++;
        }
        else {
            while (n != 0) {
                int remainder = n % 10;
                count++;
                n = n / 10;
            }
        }
        return count;
    }
}
