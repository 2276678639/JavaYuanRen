package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 开心
 */
public class Main {

    public static void main(String[] args) {
        int n=3,m=3;
        int[][] c1={{60,50,80,70},{90,55,46,25},{86,79,88}};
        score(c1[0]);
        score(c1[1]);
        score(c1[2]);
        int averageTotal=average(c1[0]);

        System.out.println(Arrays.toString(c1[0]));
        System.out.println(Arrays.toString(c1[1]));
        System.out.println(Arrays.toString(c1[2]));
        System.out.println(average(c1[0]));
        System.out.println(averageTotal(averageTotal,n));
        // write your code here
    }



    public static int average(int[] score){
        int scoreTotal=0;
        int avg=0;
        for (int i = 0; i < score.length-1; i++) {
            scoreTotal+=score[i];
        }
        avg =scoreTotal/score.length;
        return avg;
    }

    public static int averageTotal(int averageTotal,int n){
        int avg=averageTotal/n;
        return avg;
    }



    public static void score(int[] score){
        for (int i = 0; i < score.length-1; i++) {
            for (int j = 0; j < score.length - i - 1; j++) {
                if (score[j]<score[j+1]){
                        int temp=score[j];
                        score[j]=score[j+1];
                        score[j+1]=temp;
                }
            }
        }
    }









}
