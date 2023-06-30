package org.example.ClassWork;

import java.util.LinkedList;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        Random random = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            myList.add(random.nextInt(10));
        }
        System.out.println(myList);
        int sumEvenNum = getSumEvenNum(myList);

        System.out.println(sumEvenNum);
    }

    /**
     * @apiNote Построить однонаправленный список целых чисел. Найти сумму
     * четных элементов списка.
     * @param myList Рандомный список.
     * @return Сумма чётных элементов.
     */

    private static int getSumEvenNum(LinkedList<Integer> myList) {
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                sum += myList.get(i);
            }
        }
        return sum;
    }
}
