package com.company.lianXi;

public class test6 {
    public static void main(String args) {
        int num=200;
        while (num<=500) {
            boolean tag = false;       //素数标记
            for(int d=2;d<=num-1;d++){
                if(num % d==0){
                    tag=true;
                    break;
                }
            }
            if(tag==true){                //如果是素数
                System.out.println(num);
            }
            num++;
        }
    }
}
