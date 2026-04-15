package org.example.week3and4;

import java.util.Scanner;
class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int result = 1;
        for (int i = 1; i <= p; i++)
            result *= n;
        System.out.println(result);
        input.close();
    }
}