package org.example.week3and4;

import java.util.Scanner;
class CompareSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println(sum + " " + formula);
        }
        input.close();
    }
}
