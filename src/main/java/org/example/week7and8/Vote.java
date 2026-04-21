package org.example.week7and8;

import java.util.*;
class Vote{
    boolean f(int a){return a>=18;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Vote o=new Vote();
        for(int i=0;i<10;i++)System.out.println(o.f(sc.nextInt()));
    }}
