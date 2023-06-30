package org.example.HomeWork.DZ1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner sc = new Scanner((System.in));
        System.out.println("Введите количество элементов списка: ");
        int n = sc.nextInt();
        sc.close();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(random.nextInt(99));
        }
        System.out.println("Начальный список: " + "\n" + integerLinkedList);
/**
 * @apiNote Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */

        System.out.println("\n" + "Перевернутый список: ");
        while (integerLinkedList.size() > 0) {
            String revNun = (integerLinkedList.pollLast() + " ");
            System.out.print(revNun);
        }
        System.out.println();
    }
}
