package com.company.day3;

public class text1 {
    public static void main(String[] args) {
        int num=0;
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}
