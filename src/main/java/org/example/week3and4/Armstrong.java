package org.example.week3and4;

import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int original = n;
        int sum = 0;

        while (n != 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        if (sum == original) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");

        input.close();
    }
}
