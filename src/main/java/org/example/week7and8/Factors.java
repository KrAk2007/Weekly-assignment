package org.example.week7and8;

import java.util.*;
class Factors{
    static int[] f(int n){
        int c=0;
        for(int i=1;i<=n;i++)if(n%i==0)c++;
        int[] a=new int[c];
        int j=0;
        for(int i=1;i<=n;i++)if(n%i==0)a[j++]=i;
        return a;
    }
    static int sum(int[] a){int s=0;for(int x:a)s+=x;return s;}
    static int prod(int[] a){int p=1;for(int x:a)p*=x;return p;}
    static double sq(int[] a){double s=0;for(int x:a)s+=Math.pow(x,2);return s;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=f(n);
        System.out.println(sum(a));
        System.out.println(prod(a));
        System.out.println(sq(a));
    }}
