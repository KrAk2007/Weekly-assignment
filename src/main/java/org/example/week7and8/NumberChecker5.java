package org.example.week7and8;

import java.util.*;

public class NumberChecker5 {
    static int sumDiv(int n){
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0)s+=i;
        return s;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Perfect="+(sumDiv(n)==n));
        System.out.println("Abundant="+(sumDiv(n)>n));
        System.out.println("Deficient="+(sumDiv(n)<n));
    }
}
