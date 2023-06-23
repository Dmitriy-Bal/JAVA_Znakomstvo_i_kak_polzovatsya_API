package org.example.HomeWork;

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (primeNum(i)) {
                sum += i;
                System.out.print(i + ", ");
            }

        }
        System.out.println();
        System.out.println("sum = " + sum);
    }

    /**
     * @param n максимальное значение последовательности чисел
     * @return sum
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     */

    public static boolean primeNum(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
