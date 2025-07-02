package com.Nk.GFG.Journey.Day_3_Recursion;

public class PrintNumbersOneTwoN {
    // Print numbers from one two n
    // https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1
    public static void main(String[] args) {
        int n = 5;
        printTillN(n);
    }
    static void printTillN(int N) {
        if (N==0){
            return;
        }
        printTillN(N-1);
        System.out.print(N + " ");
    }
}
