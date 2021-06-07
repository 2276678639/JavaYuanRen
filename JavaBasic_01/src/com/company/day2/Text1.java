package com.company.day2;

import java.util.Scanner;

/**
 * 输入一个月份，判断现在属于什么季节
 */
public class Text1 {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("现在是春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("现在是夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("现在是秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("现在是冬季");
                break;
            default:
                System.err.println("您输入的月份不正确");
                break;
        }
    }
}
