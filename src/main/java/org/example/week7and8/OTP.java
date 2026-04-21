package org.example.week7and8;

public class OTP {
    static int gen(){
        return (int)(Math.random()*900000)+100000;
    }

    public static void main(String[] args){
        for(int i=0;i<10;i++) System.out.println(gen());
    }
}
