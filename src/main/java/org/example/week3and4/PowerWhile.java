package org.example.week3and4;

import java.util.Scanner;
class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int result = 1;
        int i = 0;
        while (i < p) {
            result *= n;
            i++;
        }
        System.out.println(result);
        input.close();
    }
}