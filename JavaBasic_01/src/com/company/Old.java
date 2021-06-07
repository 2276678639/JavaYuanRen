package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Old {

    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个年龄：");
        int num=scanner.nextInt();
        if (num>0&&num<=3){
            System.out.println("你是婴幼儿");
        }else if (num>0&&num<=12){
            System.out.println("你是儿童");
        }else if (num>0&&num<=17){
            System.out.println("你是青少年");
        }else if (num>0&&num<=27){
            System.out.println("你是青年");
        }else if (num>0&&num>=28){
            System.out.println("你是老年人");
        }else {
            System.err.println("你输入的不是合法数字");
        }
    }


}
