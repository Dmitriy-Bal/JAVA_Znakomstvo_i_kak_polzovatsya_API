package org.example.ClassWork;

public class Ex2 {
    public static void main(String[] args) {
        int[] arrNum = {8, 4, 2, 5, 8, 4, 9, 3, 4, 2};
        System.out.println(countElement(arrNum));
    }

    /**
     * apiNum Дан массив целых чисел. Найти количество пар соседних элементов,
     * где первый элемент вдвое больше второго.
     * @param arr массив целых чисел
     * @return countN результат вычесления
     */

    public static int countElement(int[] arr) {
        int countN = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 2 * arr[i]) {
                countN += 1;
            }
        }
        return countN;
    }
}

