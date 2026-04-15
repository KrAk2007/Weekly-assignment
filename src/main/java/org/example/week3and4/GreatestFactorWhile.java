package org.example.week3and4;

import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = n - 1;
        int gf = 1;
        while (i >= 1) {
            if (n % i == 0) {
                gf = i;
                break;
            }
            i--;
        }
        System.out.println(gf);
        input.close();
    }
}
