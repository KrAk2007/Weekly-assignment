package org.example.week9and10;

import java.util.*;

class PalindromeCheck {
    public static boolean method1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static boolean method2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return method2(s, i + 1, j - 1);
    }

    public static boolean method3(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(method1(s));
        System.out.println(method2(s, 0, s.length() - 1));
        System.out.println(method3(s));
    }
}