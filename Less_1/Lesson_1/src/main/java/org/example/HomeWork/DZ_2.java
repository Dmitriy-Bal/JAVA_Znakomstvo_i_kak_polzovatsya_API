package org.example.HomeWork;

public class DZ_2 {
    public static void main(String[] args) {
        int[] arr = {1, 9, -5, 7, 4, 9, 7, -2, 5, 4, 5, 0, -999, 2000};

        int sum = 0;
        int num = 0;

        /**
         * @apiNote Дана последовательность целых чисел,
         * оканчивающаяся нулем. Найти сумму положительных чисел,
         * после которых следует отрицательное число.
         */

        for (int i = 0; arr[i] !=0; i++) {
            if (arr[i] < 0) {
                num = arr[i-1];
                System.out.println(num);
                sum += num;
                continue;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}