package org.example.week7and8;

public class MatrixAdvanced {
    public static void main(String[] args){
        int[][] a={{1,2},{3,4}};
        int det=a[0][0]*a[1][1]-a[0][1]*a[1][0];
        System.out.println("Det="+det);
    }
}
