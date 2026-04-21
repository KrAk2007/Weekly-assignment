package org.example.week7and8;

import java.util.*;
class Trig{
    double[] f(double d){
        double r=Math.toRadians(d);
        return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Trig o=new Trig();
        double[] r=o.f(sc.nextDouble());
        System.out.println(r[0]+" "+r[1]+" "+r[2]);
    }}
