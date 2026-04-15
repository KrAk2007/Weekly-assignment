package org.example.week3and4;

import java.util.Scanner;
class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int gf = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                gf = i;
                break;
            }
        }
        System.out.println(gf);
        input.close();
    }
}
