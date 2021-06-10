package com.company.day3;

import java.util.Scanner;

/**
 * 求出 整形 浮点型 字符型 这三种类型中的一个类型 两个数求和  (刚开始是不确定到底是什么类型的数据)
 */
public class text3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        double v1=scanner.nextDouble();
        System.out.println("请输入第二个数据：");
        double v2=scanner.nextDouble();
        double sum = sum(v1, v2);
        System.out.println(sum);
    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static double sum(double x,int y){
        return x+y;
    }
    public static double sum(double x,double y){
        return x+y;
    }
    public static char sum(char x,char y){
        return (char)(x+y);
    }
}
