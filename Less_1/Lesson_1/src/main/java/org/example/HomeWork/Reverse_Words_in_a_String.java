package org.example.HomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse_Words_in_a_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String stringNew = sc.nextLine();
        System.out.println(zadanie1(stringNew));
    }

    /**
     * @param stringNew исходная строка
     * @return возвращаемая строка. Должна содержать только один пробел,
     * разделяющий слова. Не включайте никаких дополнительных пробелов.
     * @apiNote Поменять местами слова в строке.
     */

    private static String zadanie1(String stringNew) {
        List<String> words = Arrays.asList(stringNew.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
