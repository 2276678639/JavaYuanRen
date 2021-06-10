package com.company.day3;

import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAverage=0;//最高平均分
        int c=0;//最高分班级
        for (int i = 0; i < 3; i++) {
            int p=0;//总分
            int average;//平均分
            for (int j = 0; j < 4; j++) {
                System.out.println("请输入第"+(i+1)+"个班级第"+(j+1)+"位同学的成绩");
                int cm= scanner.nextInt();//每次输入的成绩
                p+=cm;
                average=p/4;
                if (maxAverage<average){
                    maxAverage=average;
                    c=i+1;
                }
                if (j==3){
                    System.out.println("第"+(i+1)+"个班的平均分是"+average);
                }
            }
        }
        System.out.println(c+"班的平均分最高，是"+maxAverage+"分");
    }
}
