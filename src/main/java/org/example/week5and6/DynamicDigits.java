package org.example.week5and6;

import java.util.Scanner;
class DynamicDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int max=10;
        int[] arr=new int[max];
        int i=0;

        while(n>0){
            if(i==max){
                max+=10;
                int[] temp=new int[max];
                for(int j=0;j<i;j++) temp[j]=arr[j];
                arr=temp;
            }
            arr[i++]=n%10;
            n/=10;
        }

        int max1=0, max2=0;

        for(int j=0;j<i;j++){
            if(arr[j]>max1){
                max2=max1;
                max1=arr[j];
            } else if(arr[j]>max2 && arr[j]!=max1){
                max2=arr[j];
            }
        }

        System.out.println(max1+" "+max2);
    }
}
