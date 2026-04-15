package org.example.week5and6;

import java.util.Scanner;
class Copy2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[] one=new int[r*c];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                one[k++]=arr[i][j];
            }
        }
        for(int i=0;i<k;i++) System.out.print(one[i]+" ");
    }
}
