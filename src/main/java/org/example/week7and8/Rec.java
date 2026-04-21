package org.example.week7and8;

import java.util.*;
class Rec{
    static int r(int n){return n==0?0:n+r(n-1);}
    static int f(int n){return n*(n+1)/2;}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(r(n));
        System.out.println(f(n));
    }}