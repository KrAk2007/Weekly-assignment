package org.example.week7and8;

import java.util.*;
class Triangle{
    double rounds(double a,double b,double c){return 5000/(a+b+c);}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Triangle o=new Triangle();
        System.out.println(o.rounds(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
    }}
