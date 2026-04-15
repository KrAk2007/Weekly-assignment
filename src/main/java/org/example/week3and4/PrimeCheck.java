package org.example.week3and4;

import java.util.Scanner;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isPrime = true;

        if (n <= 1) isPrime = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");

        input.close();
    }
}
