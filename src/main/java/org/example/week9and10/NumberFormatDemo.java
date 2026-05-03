package org.example.week9and10;

import java.util.*;

class NumberFormatDemo {
    public static void generate(String s) {
        int x = Integer.parseInt(s);
    }

    public static void handle(String s) {
        try {
            int x = Integer.parseInt(s);
        } catch (NumberFormatException e) {
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
