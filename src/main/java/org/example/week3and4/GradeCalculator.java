package org.example.week3and4;

import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double c = input.nextDouble();
        double m = input.nextDouble();
        double avg = (p + c + m) / 3;

        System.out.println("Average = " + avg);

        if (avg >= 80) System.out.println("Grade A");
        else if (avg >= 70) System.out.println("Grade B");
        else if (avg >= 60) System.out.println("Grade C");
        else if (avg >= 50) System.out.println("Grade D");
        else if (avg >= 40) System.out.println("Grade E");
        else System.out.println("Grade R");

        input.close();
    }
}
