package org.example.week7and8;

import java.util.*;
class QR{
    int[] f(int n,int d){return new int[]{n/d,n%d};}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        QR o=new QR();
        int[] r=o.f(sc.nextInt(),sc.nextInt());
        System.out.println(r[0]+" "+r[1]);
    }}
