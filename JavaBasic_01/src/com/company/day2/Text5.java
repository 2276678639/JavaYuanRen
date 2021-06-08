package com.company.day2;

import java.util.Scanner;

public class Text5 {
    public static void main(String[] args) {
        /**
         * 手动输入三个值，求最大值
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2=scanner.nextInt();
        System.out.println("请输入第三个数：");
        int num3=scanner.nextInt();
        int max=num1;
        if(max<num2){
            max=num2;
        }
        if(max<num3){
            max=num3;
        }
        System.out.println("最大值为："+max);


    }
}
