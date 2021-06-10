package com.company.day3;

import java.util.Scanner;

public class textHanShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n=scanner.nextInt();
        mul(n);
    }


    public static void mul(int number){
        for (int i=1;i<=number;i++){
            for (int j=1;j<i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
        }
    }
    public static String getStr(String string){
        string=string+"11";
        return string;
    }
}
