package org.example.week7and8;

import java.util.*;
class Friends{
    int min(int[] a){int m=a[0];for(int x:a)if(x<m)m=x;return m;}
    int max(int[] a){int m=a[0];for(int x:a)if(x>m)m=x;return m;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[3];
        int[] h=new int[3];
        for(int i=0;i<3;i++)age[i]=sc.nextInt();
        for(int i=0;i<3;i++)h[i]=sc.nextInt();
        Friends o=new Friends();
        System.out.println(o.min(age));
        System.out.println(o.max(h));
    }}
