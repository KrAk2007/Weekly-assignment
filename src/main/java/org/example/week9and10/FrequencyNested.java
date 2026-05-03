package org.example.week9and10;

import java.util.*;

class FrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == '0') continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
