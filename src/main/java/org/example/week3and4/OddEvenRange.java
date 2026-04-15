package org.example.week3and4;

import java.util.Scanner;
class OddEvenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " Even");
                else
                    System.out.println(i + " Odd");
            }
        }
        input.close();
    }
}
