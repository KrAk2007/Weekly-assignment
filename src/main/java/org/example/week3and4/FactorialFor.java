package org.example.week3and4;

import java.util.Scanner;
class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println(fact);
        input.close();
    }
}
