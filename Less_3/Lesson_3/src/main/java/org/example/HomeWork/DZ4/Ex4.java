package org.example.HomeWork.DZ4;

import java.util.ArrayList;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrList.add(random.nextInt(0, 10));
        }
        System.out.println(arrList.toString());
        int max = arrList.get(0);
        int min = arrList.get(0);
        int sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) > max)
                max = arrList.get(i);
            if (arrList.get(i) < min)
                min = arrList.get(i);
            sum += arrList.get(i);
        }
        float average = (float) sum / arrList.size();

        /**
         * @apiNote Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
         */

        System.out.printf("Максимальное число: %d\n", max);
        System.out.printf("Минимальное число: %d\n", min);
        System.out.printf("Среднее число из списка: %.1f\n", average);
    }
}
