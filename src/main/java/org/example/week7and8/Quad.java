package org.example.week7and8;

import java.util.*;
class Quad{
    static double[] f(double a,double b,double c){
        double d=b*b-4*a*c;
        if(d<0)return new double[]{};
        if(d==0)return new double[]{-b/(2*a)};
        return new double[]{(-b+Math.sqrt(d))/(2*a),(-b-Math.sqrt(d))/(2*a)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] r=f(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        for(double x:r)System.out.println(x);
    }}