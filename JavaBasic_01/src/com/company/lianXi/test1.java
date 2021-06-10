package com.company.lianXi;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1=sc.nextInt();
        System.out.println("请输入第一个数");
        int num2=sc.nextInt();
        System.out.println("请输入第一个数");
        int num3=sc.nextInt();
        System.out.println("三个数的和为"+(num1+num2+num3));
        System.out.println("三个数的差为"+(num1-num2-num3));
    }
}
