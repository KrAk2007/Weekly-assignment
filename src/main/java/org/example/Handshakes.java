package org.example;

import java.util.Scanner;
class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = (n * (n - 1)) / 2;
        System.out.println("The number of possible handshakes is " + result);
        input.close();
    }
}
