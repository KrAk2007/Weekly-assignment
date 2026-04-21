package org.example.week7and8;


import java.util.*;

public class NumberChecker1 {
    static int[] digits(int n){
        int c=0,t=n;
        while(t>0){c++;t/=10;}
        int[] a=new int[c];
        for(int i=c-1;i>=0;i--){a[i]=n%10;n/=10;}
        return a;
    }
    static boolean duck(int[] a){
        for(int x:a) if(x==0) return true;
        return false;
    }
    static boolean arm(int n,int[] a){
        int s=0;
        for(int x:a) s+=Math.pow(x,a.length);
        return s==n;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=digits(n);
        System.out.println(duck(a));
        System.out.println(arm(n,a));
    }
}