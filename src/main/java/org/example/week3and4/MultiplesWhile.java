package org.example.week3and4;

import java.util.Scanner;
class MultiplesWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 100;
        while (i >= 1) {
            if (i % n == 0)
                System.out.println(i);
            i--;
        }
        input.close();
    }
}
