package org.example.week7and8;

import java.util.*;

public class FactorsAdvanced {
    static int[] f(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0)c++;
        int[] a=new int[c];
        int j=0;
        for(int i=1;i<=n;i++) if(n%i==0)a[j++]=i;
        return a;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=f(n);
        for(int x:a) System.out.print(x+" ");
    }
}
