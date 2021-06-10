package com.company.day3;

public class testFor {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=9;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
