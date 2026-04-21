package org.example.week7and8;

import java.util.*;
class Leap{
    static boolean f(int y){
        return (y%400==0)||(y%4==0&&y%100!=0);
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println(f(sc.nextInt()));
    }}
