package org.example.week7and8;

import java.util.*;

public class NumberChecker3 {
    static int reverse(int n){
        int r=0;
        while(n>0){r=r*10+n%10;n/=10;}
        return r;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
        System.out.println(n==reverse(n));
    }
}
