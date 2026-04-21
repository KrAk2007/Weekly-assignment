package org.example.week7and8;

import java.util.*;
class Hand{
    int f(int n){return n*(n-1)/2;}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Hand o=new Hand();
        System.out.println(o.f(sc.nextInt()));
    }}
