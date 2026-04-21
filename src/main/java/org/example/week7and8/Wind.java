package org.example.week7and8;

import java.util.*;
class Wind{
    double f(double t,double v){
        return 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Wind o=new Wind();
        System.out.println(o.f(sc.nextDouble(),sc.nextDouble()));
    }}