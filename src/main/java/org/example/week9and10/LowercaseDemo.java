package org.example.week9and10;

import java.util.*;

class LowercaseDemo {
    public static String convert(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
            res += c;
        }
        return res;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String a = convert(s);
        String b = s.toLowerCase();

        System.out.println(compare(a, b));
    }
}
