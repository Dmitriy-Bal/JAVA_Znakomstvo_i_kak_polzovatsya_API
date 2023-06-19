package org.example.ClassWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(zadanie1(n));

    }

    /**
     * @apiNote Заданное целое число возвращает разность  между произведением его цифр из суммы его цифр. n
     * @param n вхлдящее целочисленное число
     * @return резудьтат выполнения задачи
     */

    private static int zadanie1(int n) { // todo: переименовать метод
        int multi = 1, sum = 0;
        while (n != 0) {
            int m = n % 10;
            multi *= m;
            sum += m;
            n /= 10;
        }
        return multi - sum;
    }
}