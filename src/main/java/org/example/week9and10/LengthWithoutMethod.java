package org.example.week9and10;

import java.util.*;

class LengthWithoutMethod {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int a = findLength(s);
        int b = s.length();

        System.out.println(a + " " + b);
    }
}
