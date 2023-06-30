package org.example.ClassWork;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1, -2, -1, 5, 9, -10));
        Scanner sc = new Scanner((System.in));

//        int size = sc.nextInt();
//        for (int i = 0; i < size; i++) {
//            System.out.println("Enter number: ");
//            myList.add(sc.nextInt());
//        }

//        oneDeletNegstiveNumbers(myList); // первый метод
        twoDeletNegstiveNumbers(myList); // второй метод
        System.out.println(myList);
    }

    private static void oneDeletNegstiveNumbers(LinkedList<Integer> myList) { // первый метод
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < 0) {
                myList.remove(i);
                i--;
            }
        }
    }

    private static void twoDeletNegstiveNumbers(LinkedList<Integer> myList) { // второй метод
        for (int i = myList.size() - 1; i >= 0; i--) {
            if (myList.get(i) < 0) {
                myList.remove(i);
            }
        }
    }
}
