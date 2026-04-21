package org.example.week7and8;

import java.util.*;

public class CalendarProg {
    static boolean leap(int y){
        return (y%400==0)||(y%4==0&&y%100!=0);
    }

    static int days(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && leap(y)) return 29;
        return d[m-1];
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),y=sc.nextInt();
        int d=days(m,y);

        for(int i=1;i<=d;i++){
            System.out.printf("%3d",i);
            if(i%7==0) System.out.println();
        }
    }
}
