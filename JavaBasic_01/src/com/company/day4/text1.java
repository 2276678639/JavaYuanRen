package com.company.day4;

import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        int [] array={12,341,546,4896,48,489,52,13};
        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                sum=sum+array[i];
            }
        }
        return sum;
    }
}
