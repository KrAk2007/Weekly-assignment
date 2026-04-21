package org.example.week7and8;

import java.util.*;
class Spring{
    boolean f(int m,int d){
        return (m==3&&d>=20)||(m>3&&m<6)||(m==6&&d<=20);
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Spring o=new Spring();
        System.out.println(o.f(sc.nextInt(),sc.nextInt()));
    }}
