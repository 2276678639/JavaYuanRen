package com.company.day2;

import java.util.Scanner;

public class Text6 {
    public static void main(String[] args) {
        /**
         * 手动输入0~9之间的数，求出现的偶数的次数，如果输入的数小于0或者是大于9，程序结束（向控制台输出：您输入的数据过大）
         */
        int num = 0;
        int num1 = 0;
        int count=0;
        do {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("请输入一个数字");
            int i = scanner1.nextInt();
            num = i;
            if (i % 2 == 0) {
                num1++;
            }
            count++;
        } while
        (num >= 0 && num <= 9);
        System.err.println("您输入的数据过大");
        System.out.println("您一共输入了"+count+"个数，其中偶数的数量为：" + num1);
    }
}