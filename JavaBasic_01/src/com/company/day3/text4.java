package com.company.day3;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int number = input.nextInt();
        String str = "";
        while(number/10>0) {
            int a=number%10;
            number = number/10;
            str = str+a;
        }
        str=str+number;
        System.out.println(str);
    }
}
