package com.anish.practice.PatternsPrograms;

public class PatternsPractice {


    public static void main(String[] args) {
        samplePattern(4);
    }

    static void samplePattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
