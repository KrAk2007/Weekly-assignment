package org.example.week3and4;

import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();
        if (years > 5)
            System.out.println("Bonus = " + (salary * 0.05));
        else
            System.out.println("No Bonus");
        input.close();
    }
}
