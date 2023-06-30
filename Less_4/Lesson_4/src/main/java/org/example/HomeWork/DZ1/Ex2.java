package org.example.HomeWork.DZ1;

public class Ex2 {
    public static void main(String[] args) {
        int[] numbers = {15, 8, 17, 44, 53, 13, 23, 78, 89, 15};
        System.out.println("\n" + "Массив перед реверсом:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

/**
 * @apiNote Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("\n" + "Массив после реверса:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
