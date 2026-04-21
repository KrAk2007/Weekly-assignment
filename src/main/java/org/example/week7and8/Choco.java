package org.example.week7and8;

import java.util.*;
class Choco{
    int[] f(int c,int n){return new int[]{c/n,c%n};}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Choco o=new Choco();
        int[] r=o.f(sc.nextInt(),sc.nextInt());
        System.out.println(r[0]+" "+r[1]);
    }}
