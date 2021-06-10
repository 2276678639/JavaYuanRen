package com.company.day2;

import java.util.Scanner;

public class Text3 {
    /**
     * 手动输入两个数，求这两个数中所有的偶数，求偶数的个数
     * @param args
     */


    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
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
            if (min % 2 == 0) {
                System.out.println("偶数为：" + min);
                i++;
            }
            min++;
        }
        System.out.println("偶数的个数为"+i);
    }
}
