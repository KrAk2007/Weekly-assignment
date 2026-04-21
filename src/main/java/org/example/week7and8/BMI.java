package org.example.week7and8;

import java.util.*;
class BMI{
    double calc(double w,double h){h/=100;return w/(h*h);}
    String status(double b){
        if(b<18.5)return"Under";
        if(b<25)return"Normal";
        if(b<30)return"Over";
        return"Obese";
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        BMI o=new BMI();
        for(int i=0;i<10;i++){
            double w=sc.nextDouble(),h=sc.nextDouble();
            double b=o.calc(w,h);
            System.out.println(b+" "+o.status(b));
        }}
}