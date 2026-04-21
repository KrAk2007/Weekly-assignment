package org.example.week7and8;

public class Marks {
    public static void main(String[] args){
        int[][] a=new int[5][3];
        for(int i=0;i<5;i++)
            for(int j=0;j<3;j++)
                a[i][j]=(int)(Math.random()*100);

        for(int i=0;i<5;i++){
            int t=a[i][0]+a[i][1]+a[i][2];
            System.out.println("Total="+t+" Avg="+t/3.0);
        }
    }
}
