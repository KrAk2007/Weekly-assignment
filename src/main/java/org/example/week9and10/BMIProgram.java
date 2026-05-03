package org.example.week9and10;

import java.util.*;

class BMIProgram {
    public static String[][] compute(double[][] data) {
        String[][] res = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            double bmi = weight / (height * height);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            res[i][0] = String.valueOf(data[i][1]);
            res[i][1] = String.valueOf(weight);
            res[i][2] = String.valueOf(bmi);
            res[i][3] = status;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] res = compute(data);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1] + " " + res[i][2] + " " + res[i][3]);
        }
    }
}
