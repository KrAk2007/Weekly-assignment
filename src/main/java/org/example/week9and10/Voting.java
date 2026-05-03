package org.example.week9and10;

import java.util.*;

class Voting {
    public static String[][] check(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) res[i][1] = "true";
            else res[i][1] = "false";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) ages[i] = sc.nextInt();

        String[][] res = check(ages);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}
