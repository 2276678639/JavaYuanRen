package com.company.day2;

import java.util.Scanner;

/**
 * 输入一个月份，输入一个日期，判断今天是今年的第几天
 */
public class Text2 {
    public static void main(String[] arg) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = scanner1.nextInt();
        System.out.println("请输入一个日期：");
        int day = scanner2.nextInt();
        if (day > 0 && day <= 31) {
            switch (month) {
                default:
                    System.err.println("您没有输入一个正确的月份");
                    break;
                case 1:
                    day = day;
                    System.out.println(day);
                    break;
                case 2:
                    if (day < 29) {
                        day = day + 31;
                        System.out.println(day);
                    } else {
                        System.err.println("您输入的不是一个有效日期");
                    }
                    break;
                case 3:
                    day = day + 30 * 2;
                    System.out.println(day);
                    break;
                case 4:
                    if (day < 29) {
                        day = day + 30 * 3 + 1;
                        System.out.println(day);
                    } else {
                        System.err.println("您输入的不是一个有效日期");
                    }
                    break;
                case 5:
                    day = day + 30 * 4 + 1;
                    System.out.println(day);
                    break;
                case 6:
                    if (day < 29) {
                        day = day + 30 * 5 + 2;
                        System.out.println(day);
                    } else {
                        System.err.println("您输入的不是一个有效日期");
                    }
                    break;
                case 7:
                    day = day + 30 * 6 + 2;
                    System.out.println(day);
                    break;
                case 8:
                    day = day + 30 * 7 + 3;
                    System.out.println(day);
                    break;
                case 9:
                    if (day < 29) {
                        day = day + 30 * 8 + 4;
                        System.out.println(day);
                    } else {
                        System.err.println("您输入的不是一个有效日期");
                    }
                    break;
                case 10:
                    day = day + 30 * 9 + 4;
                    System.out.println(day);
                    break;
                case 11:
                    if (day < 29) {
                        day = day + 30 * 10 + 5;
                        System.out.println(day);
                    } else {
                        System.err.println("您输入的不是一个有效日期");
                    }
                    break;
                case 12:
                    day = day + 30 * 11 + 5;
                    System.out.println(day);
                    break;
            }
        }
    }
}
