package org.example.week7and8;

import java.util.*;
class Arr{
    static int sign(int n){return n>=0?1:-1;}
    static boolean even(int n){return n%2==0;}
    static int cmp(int a,int b){return a>b?1:a<b?-1:0;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            if(sign(a[i])==1)System.out.println(even(a[i]));
            else System.out.println("negative");
        }
        System.out.println(cmp(a[0],a[4]));
    }}
