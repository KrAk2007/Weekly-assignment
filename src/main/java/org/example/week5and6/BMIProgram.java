package org.example.week5and6;

import java.util.Scanner;
class BMIProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double[] weight=new double[n];
        double[] height=new double[n];
        double[] bmi=new double[n];
        String[] status=new String[n];

        for(int i=0;i<n;i++){
            weight[i]=sc.nextDouble();
            height[i]=sc.nextDouble();
        }

        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);

            if(bmi[i]>=25) status[i]="Overweight";
            else if(bmi[i]>=18.5) status[i]="Normal";
            else status[i]="Underweight";
        }

        for(int i=0;i<n;i++){
            System.out.println(weight[i]+" "+height[i]+" "+bmi[i]+" "+status[i]);
        }
    }
}
