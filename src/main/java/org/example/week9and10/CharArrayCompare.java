package org.example.week9and10;

import java.util.*;

class CharArrayCompare {
    public static char[] convert(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] a = convert(s);
        char[] b = s.toCharArray();

        System.out.println(compare(a, b));
    }
}