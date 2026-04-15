package org.example.week5and6;

import java.util.Scanner;
class Grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double[] phy=new double[n];
        double[] chem=new double[n];
        double[] math=new double[n];
        double[] per=new double[n];
        String[] grade=new String[n];

        for(int i=0;i<n;i++){
            phy[i]=sc.nextDouble();
            chem[i]=sc.nextDouble();
            math[i]=sc.nextDouble();

            per[i]=(phy[i]+chem[i]+math[i])/3;

            if(per[i]>=80) grade[i]="A";
            else if(per[i]>=70) grade[i]="B";
            else if(per[i]>=60) grade[i]="C";
            else if(per[i]>=50) grade[i]="D";
            else if(per[i]>=40) grade[i]="E";
            else grade[i]="R";
        }

        for(int i=0;i<n;i++){
            System.out.println(per[i]+" "+grade[i]);
        }
    }
}