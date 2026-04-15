package org.example;

import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double r = input.nextDouble();
        double t = input.nextDouble();
        double si = p * r * t / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
        input.close();
    }
}
