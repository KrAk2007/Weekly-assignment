package org.example.week7and8;

import java.util.*;

public class NumberChecker4 {
    static boolean prime(int n){
        if(n<=1)return false;
        for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0)return false;
        return true;
    }
    static boolean buzz(int n){return n%7==0||n%10==7;}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime="+prime(n));
        System.out.println("Buzz="+buzz(n));
    }
}