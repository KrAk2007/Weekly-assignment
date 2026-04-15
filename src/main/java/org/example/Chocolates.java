package org.example;

import java.util.Scanner;
class Chocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chocolates = input.nextInt();
        int children = input.nextInt();
        System.out.println("The number of chocolates each child gets is " + (chocolates/children) + " and the number of remaining chocolates are " + (chocolates%children));
        input.close();
    }
}
