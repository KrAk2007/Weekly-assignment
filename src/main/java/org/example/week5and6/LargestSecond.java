package org.example.week5and6;

import java.util.Scanner;
class LargestSecond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[10];
        int i=0;

        while(n>0 && i<10){
            arr[i++]=n%10;
            n/=10;
        }

        int max=0, second=0;

        for(int j=0;j<i;j++){
            if(arr[j]>max){
                second=max;
                max=arr[j];
            } else if(arr[j]>second && arr[j]!=max){
                second=arr[j];
            }
        }

        System.out.println(max+" "+second);
    }
}
