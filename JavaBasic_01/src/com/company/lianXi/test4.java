package com.company.lianXi;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        int max=i;
        int min=i;
        while (i!=0){
            if (max<i){
                max=i;
            }
            if (min>i){
                min=i;
            }
            i=scanner.nextInt();
        }
        System.out.println(max+"\t"+min);
    }
}
