package org.example.week9and10;

import java.util.*;

class SubstringCompare {
    public static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
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
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = customSubstring(s, start, end);
        String s2 = s.substring(start, end);

        System.out.println(compare(s1, s2));
    }
}
