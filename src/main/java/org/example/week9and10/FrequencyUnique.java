package org.example.week9and10;

import java.util.*;

class FrequencyUnique {
    public static char[] unique(String s) {
        char[] temp = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (temp[j] == s.charAt(i)) found = true;
            }
            if (!found) temp[k++] = s.charAt(i);
        }

        char[] res = new char[k];
        for (int i = 0; i < k; i++) res[i] = temp[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] u = unique(s);

        for (char c : u) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) count++;
            }
            System.out.println(c + " " + count);
        }
    }
}
