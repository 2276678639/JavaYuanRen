package com.company.day4;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int j=0;
        for (int i = 0; i < a; i++) {
            j+=b;

        }
        System.out.println(j);
    }
}
