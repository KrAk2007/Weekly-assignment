package org.example.week7and8;

import java.util.*;
class Check{
    int f(int n){return n>0?1:n<0?-1:0;}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Check o=new Check();
        System.out.println(o.f(sc.nextInt()));
    }}