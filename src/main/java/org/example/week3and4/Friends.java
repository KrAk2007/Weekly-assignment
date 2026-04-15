package org.example.week3and4;

import java.util.Scanner;
class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageA = input.nextInt();
        int ageB = input.nextInt();
        int ageC = input.nextInt();

        double hA = input.nextDouble();
        double hB = input.nextDouble();
        double hC = input.nextDouble();

        if (ageA < ageB && ageA < ageC) System.out.println("Amar is youngest");
        else if (ageB < ageA && ageB < ageC) System.out.println("Akbar is youngest");
        else System.out.println("Anthony is youngest");

        if (hA > hB && hA > hC) System.out.println("Amar is tallest");
        else if (hB > hA && hB > hC) System.out.println("Akbar is tallest");
        else System.out.println("Anthony is tallest");

        input.close();
    }
}