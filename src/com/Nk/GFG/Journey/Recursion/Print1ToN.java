package com.Nk.GFG.Journey.Recursion;

public class Print1ToN {
    // Print 1 To N Without Loop
    // https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }
    static void printNos(int n) {
        // base case
        if (n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n + " ");
    }
}
