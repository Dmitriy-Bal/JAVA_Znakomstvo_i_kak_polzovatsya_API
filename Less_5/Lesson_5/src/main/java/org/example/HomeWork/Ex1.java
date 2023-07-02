package org.example.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Введите искомое слово (на пример: Россия): ");
        String findWord = sc.nextLine();
        sc.close();

        /**
         * @return количество искомого слова
         * @apiNote Подсчитать количество искомого слова, через map
         * (наполнением значение, где искомое слово будет являться ключом),
         * вносить все слова не нужно
         */

        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");

        System.out.println("Количество искомого слова: ");

        String[] arrayText = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText) {
            if (!findWord.toLowerCase().equals(currentWord.toLowerCase())) {
                continue;
            }
            int count = map.getOrDefault(findWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }
        System.out.println(findWord + " - " + map.getOrDefault(findWord.toLowerCase(), 0));
    }
}
