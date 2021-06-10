package com.company.day4;

import java.util.Arrays;

public class text2 {
    public static void main(String[] args) {
        //将数组中的数据进行首尾交换
        int[]i={1,2,3,4,5,6};
        int temp=0;
        temp=i[0];
        i[0]=i[i.length-1];
        i[i.length-1]=temp;
        System.out.println(Arrays.toString(i));
    }

}
