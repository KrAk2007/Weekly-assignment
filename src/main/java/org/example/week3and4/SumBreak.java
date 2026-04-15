package org.example.week3and4;

import java.util.Scanner;
class SumBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        while (true) {
            double n = input.nextDouble();
            if (n <= 0) break;
            total += n;
        }
        System.out.println(total);
        input.close();
    }
}
