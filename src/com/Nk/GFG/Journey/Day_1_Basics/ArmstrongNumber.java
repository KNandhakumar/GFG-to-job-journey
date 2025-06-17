package com.Nk.GFG.Journey.Day_1_Basics;

public class ArmstrongNumber {
    // Armstrong number
    // https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
    public static void main(String[] args) {
        int n = 152;
        if (armstrongNumber(n)){
            System.out.println("this is Armstrong number");
        }
        else {
            System.out.println("not Armstrong number");
        }
    }
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;
        while (n>0){
            int remainder = n%10;
            sum += (remainder*remainder*remainder);
            n = n/10;
        }
        return original == sum;
    }
}
