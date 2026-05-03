package org.example.week9and10;

import java.util.*;

class WordLength2D {
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

    public static String[][] wordLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = splitManual(s);
        String[][] res = wordLength(words);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}
