package org.example.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        int num1 = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int num2 = sc.nextInt();

            if (isNumberPositive(num1, num2)) {
                count++;
            }
            num1 = num2;
        }
        // 4 -> 4 -> 1 = +2
        // 3-> 2 -> = +1

        System.out.println("count = " + count);
    }

    /**
     * @appiNote Check if number is valid.
     * @param a previous number.
     * @param b next number.
     * @return is previous number less than 0 and next number is greater or equal 0
     */

    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b > 0 ;
    }
}