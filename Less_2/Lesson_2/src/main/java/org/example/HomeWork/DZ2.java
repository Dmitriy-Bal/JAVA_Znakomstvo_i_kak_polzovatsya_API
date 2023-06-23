package org.example.HomeWork;

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5}; // true
//        int[] n = {5, 4, 3, 2, 1}; // false
//        int[] n = {1, 1, 3, 4, 5}; // false

        if (sequence(n))
            System.out.println("Возрастающая последовательность");
        else System.out.println("Последовательность не является возрастающей");
    }

    /**
     * @param arr проверка на возрастающую последовательность
     * @return Возрастающая последовательность (или последовательность не является возрастающей)
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     */

    public static boolean sequence(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) return false;
        }
        return true;
    }

}
