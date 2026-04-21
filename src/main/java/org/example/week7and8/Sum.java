package org.example.week7and8;

import java.util.*;
class Sum{
    int f(int n){int s=0;for(int i=1;i<=n;i++)s+=i;return s;}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Sum o=new Sum();
        System.out.println(o.f(sc.nextInt()));
    }}
