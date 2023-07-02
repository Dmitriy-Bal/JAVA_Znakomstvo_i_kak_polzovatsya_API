package org.example.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 5};
        isDuble(arr);
    }

    /**
     * @param arr входной массив
     * @return флаг
     * @apiNote Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
     * В противном случае (false).
     */
    private static void isDuble(int[] arr) {
        Map<Integer, Integer> mapCh = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (!mapCh.containsKey(arr[i])) {
                mapCh.put(arr[i], 1);
            } else {
                mapCh.put(arr[i], mapCh.get(arr[i]) + 1);
                flag = true;
            }
        }

        System.out.println(flag);
    }
}