package org.example;

import java.util.Scanner;
class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        input.close();
    }
}
