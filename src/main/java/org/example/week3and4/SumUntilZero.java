package org.example.week3and4;

import java.util.Scanner;
class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double n = input.nextDouble();
        while (n != 0) {
            total += n;
            n = input.nextDouble();
        }
        System.out.println(total);
        input.close();
    }
}
