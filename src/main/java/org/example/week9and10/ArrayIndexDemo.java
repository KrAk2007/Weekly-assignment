package org.example.week9and10;

import java.util.*;

class ArrayIndexDemo {
    public static void generate(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled");
        } catch (Exception e) {
            System.out.println("Generic");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) arr[i] = sc.next();

        try {
            generate(arr);
        } catch (Exception e) {
            System.out.println("Generated");
        }
        handle(arr);
    }
}
