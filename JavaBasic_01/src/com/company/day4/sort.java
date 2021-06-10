package com.company.day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort {
    /**
     * 冒泡排序
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {10, 1, 35, 61, 36, 55, 61, 35, 89, 1, 88, 88};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] distinct=distinct(arr);
        System.out.println(Arrays.toString(distinct));

        /*System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print("\t" + arr[i]);
            }
            if (i == arr.length - 2) {
                System.out.println("\t" + arr[i + 1]);
            }
        }   */
    }

    public static void sort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }




    }
    public static int[] changeSize(int[] arr){
        int[] ints = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            ints[i]=arr[i];
        }
        return ints;

    }





    public static int[] distinct(int [] arr){
        int [] newArray=new int[0];
        int[] changeSizeArray = changeSize(newArray);
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(temp==arr[j]){
                    break;
                }else{
                    changeSizeArray[changeSizeArray.length-1]=arr[i];
                    changeSizeArray=changeSize(changeSizeArray);
                    break;
                }
            }
            if (i==arr.length-1){
                changeSizeArray[changeSizeArray.length-1]=arr[i];
            }
        }
    return changeSizeArray;

    }


}


