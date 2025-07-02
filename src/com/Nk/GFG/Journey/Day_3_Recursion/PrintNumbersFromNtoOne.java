package com.Nk.GFG.Journey.Day_3_Recursion;

public class PrintNumbersFromNtoOne {
    // Print N to 1 without loop
    // https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }
    static void printNos(int N) {
        if (N==0){
            return;
        }
        System.out.print(N + " ");
        printNos(N-1);
    }
}
