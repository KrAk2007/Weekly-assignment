package org.example.week7and8;

import java.util.*;

public class NumberChecker2 {
    static int[] digits(int n){
        int c=0,t=n;
        while(t>0){c++;t/=10;}
        int[] a=new int[c];
        for(int i=c-1;i>=0;i--){a[i]=n%10;n/=10;}
        return a;
    }
    static int sum(int[] a){int s=0;for(int x:a)s+=x;return s;}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=digits(n);

        System.out.println("Sum="+sum(a));
        System.out.println("Harshad="+(n%sum(a)==0));
    }
}
