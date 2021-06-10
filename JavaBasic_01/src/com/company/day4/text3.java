package com.company.day4;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        String[] str = {"1", "2", "3", "4"};
        String number;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要修改的数据的位置");
        index = scanner.nextInt();
        System.out.println("请输入你修改的数据");
        number = scanner.next();
        str = del(str,number,index);
        System.out.println(Arrays.toString(str));
    }

    public static String[] add(String[] arr, String number, int index) {
       String[] strings = new String[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            strings[i]=arr[i];
        }
        for (int i = strings.length-1; i >= index; i--) {
            strings[i]=strings[i-1];
        }
        strings[index-1]=number;
        return strings;
    }

    public static String[] del(String[] arr,String number,int index){
        if (arr==null){
            return null;
        }
        if (index-1<0||index>arr.length){
            return null;
        }
        arr[index-1]=null;

        String[] str = new String[arr.length-1];
        int n=0;
        for (int i = 0; i >= arr.length; i++) {
            if (arr[i]!=null){
                str[n++]=arr[i];
            }
        }
        return str;

    }
}
