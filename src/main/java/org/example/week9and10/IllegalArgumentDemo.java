package org.example.week9and10;

import java.util.*;

class IllegalArgumentDemo {
    public static void generate(String s) {
        System.out.println(s.substring(5, 2));
    }

    public static void handle(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled");
        } catch (Exception e) {
            System.out.println("Generic");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        try {
            generate(s);
        } catch (Exception e) {
            System.out.println("Generated");
        }
        handle(s);
    }
}
