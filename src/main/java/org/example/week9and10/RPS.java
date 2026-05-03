package org.example.week9and10;

import java.util.*;

class RPS {
    public static String compChoice() {
        int x = (int)(Math.random()*3);
        if (x==0) return "rock";
        if (x==1) return "paper";
        return "scissors";
    }

    public static int winner(String u, String c) {
        if (u.equals(c)) return 0;
        if (u.equals("rock") && c.equals("scissors")) return 1;
        if (u.equals("paper") && c.equals("rock")) return 1;
        if (u.equals("scissors") && c.equals("paper")) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int user = 0, comp = 0;

        for (int i = 0; i < n; i++) {
            String u = sc.next();
            String c = compChoice();

            int res = winner(u, c);
            if (res == 1) user++;
            else if (res == -1) comp++;
        }

        System.out.println(user + " " + comp);
    }
}
