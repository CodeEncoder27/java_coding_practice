package com.anish.practice.Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static int[] sortArray(int a[]){
        for(int i=0; i<a.length-1;i++){
            if(a[i] > a[i + 1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1]=temp;
                i=-1;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int a[] = {3,6,8,0,7,1};
        float f[] = {45.6F,56.7F,76.9F,45.2F,13.2F};
        float sum = 0;
        System.out.println(Arrays.toString(sortArray(a)));

        //@Todo
        for (int i = 0; i<=f.length-1;i++){
            sum += f[i] ;

        }
        System.out.println(sum);
    }
}
