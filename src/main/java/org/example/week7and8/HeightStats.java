package org.example.week7and8;

public class HeightStats {
    static int[] gen(){
        int[] a=new int[11];
        for(int i=0;i<11;i++) a[i]=(int)(Math.random()*101)+150;
        return a;
    }
    static int sum(int[] a){int s=0;for(int x:a)s+=x;return s;}
    static int min(int[] a){int m=a[0];for(int x:a)if(x<m)m=x;return m;}
    static int max(int[] a){int m=a[0];for(int x:a)if(x>m)m=x;return m;}

    public static void main(String[] args){
        int[] a=gen();
        System.out.println("Mean="+sum(a)/a.length);
        System.out.println("Min="+min(a));
        System.out.println("Max="+max(a));
    }
}
