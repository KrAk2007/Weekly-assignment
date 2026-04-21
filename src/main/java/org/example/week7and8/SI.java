package org.example.week7and8;

import java.util.*;
class SI{
    double calc(double p,double r,double t){return p*r*t/100;}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        SI o=new SI();
        System.out.println(o.calc(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
    }}