package org.example.week3and4;

import java.util.Scanner;
class Harshad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (n % sum == 0) System.out.println("Harshad Number");
        else System.out.println("Not Harshad Number");

        input.close();
    }
}