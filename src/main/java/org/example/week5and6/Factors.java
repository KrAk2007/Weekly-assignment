package org.example.week5and6;

import java.util.Scanner;
class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=10;
        int[] arr=new int[max];
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(idx==max){
                    max*=2;
                    int[] temp=new int[max];
                    for(int j=0;j<idx;j++) temp[j]=arr[j];
                    arr=temp;
                }
                arr[idx++]=i;
            }
        }
        for(int i=0;i<idx;i++) System.out.print(arr[i]+" ");
    }
}