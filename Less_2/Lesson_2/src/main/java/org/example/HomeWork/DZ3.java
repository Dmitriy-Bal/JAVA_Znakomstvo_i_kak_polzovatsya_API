package org.example.HomeWork;

import java.util.Arrays;

public class DZ3 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44, 5, -5, -3, 23, -7};

        /**
         * @apiNote Дан массив целых чисел.
         * аменить отрицательные элементы на сумму индексов двузначных элементов массива.
         * @param arr массив целых чисел
         * @return countN результат вычесления
         */

        int countInd = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10 && arr[i] <= 99) {
                countInd += (i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = countInd;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


