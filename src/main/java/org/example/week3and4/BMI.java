package org.example.week3and4;

import java.util.Scanner;
class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double height = input.nextDouble() / 100;
        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");

        input.close();
    }
}
