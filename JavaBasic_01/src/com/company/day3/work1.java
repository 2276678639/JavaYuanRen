package com.company.day3;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        printXing(9);

    }
    /*public static void printXing(int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/



    public static void printXing(int number){
        for (int i = 1; i <= (number+1)/2; i++) {
            for (int j =(number-1)/2+1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }




}
