package org.example.week3and4;

import java.util.Scanner;
class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int d = input.nextInt();
        if ((m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 20))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
        input.close();
    }
}
