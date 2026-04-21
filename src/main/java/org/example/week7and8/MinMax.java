package org.example.week7and8;

import java.util.*;
class MinMax{
    int[] f(int a,int b,int c){
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        return new int[]{min,max};
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        MinMax o=new MinMax();
        int[] r=o.f(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(r[0]+" "+r[1]);
    }}