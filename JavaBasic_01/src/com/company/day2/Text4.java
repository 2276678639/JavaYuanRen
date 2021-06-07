package com.company.day2;

import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {
        /**
         * 手动输入两个数，求两个数中所有的奇数和
         */
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1=scanner1.nextInt();
        System.out.println("请输入第二股数");
        int num2=scanner1.nextInt();
        int max=num1;
        int min=num1;
        if(max<num2){
            max=num2;
        }
        if (min>num2){
            min=num2;
        }
        int i=0;
        while (min<max) {
            if (min % 2-1 == 0) {
                System.out.println("奇数为：" + min);
                i=i+min;
            }

            min++;
        }
        System.out.println("奇数的和为"+i);

    }
}
