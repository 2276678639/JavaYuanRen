package com.company;

public class Old {

    public static void main(String args) {
        int i=0;
        int sum=0;
        while(i<=10)
        {
            i++;
            if( i%2!=0 )
                continue;
            sum+=i;
        }
        System.out.println(sum);
    }


}
