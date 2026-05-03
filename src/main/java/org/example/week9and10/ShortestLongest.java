package org.example.week9and10;

import java.util.*;

class ShortestLongest {
    public static String[] splitManual(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int index = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += s.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }

    public static String[] find(String[] words) {
        String min = words[0], max = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < min.length()) min = words[i];
            if (words[i].length() > max.length()) max = words[i];
        }
        return new String[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = splitManual(s);
        String[] res = find(words);

        System.out.println(res[0] + " " + res[1]);
    }
}
