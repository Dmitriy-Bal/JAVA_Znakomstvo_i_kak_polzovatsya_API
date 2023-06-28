package org.example.HomeWork.DZ3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        Book book1 = new Book("Пчёлы и мёд", "Сидоров", 100.99, 2013, 101);
        Book book2 = new Book("Разжигаем костры", "Иванов", 200.99, 2010, 101);
        Book book3 = new Book("Долина Нила", "Сидоров", 300.99, 2020, 102);
        Book book4 = new Book("Берега Марса", "Иванов", 400.99, 2023, 103);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        StringBuilder sortedBook = new StringBuilder();
        for (Book book : bookList) {
            if (primeNum(book.getPages()) && book.getAuthor().toLowerCase().contains("а")) {
                if (book.getYear() >= 2010) {
                    sortedBook.append(book.getName()).append("\n");
                }
            }
        }
        System.out.println("Названия книг: " + "\n" + sortedBook);
    }

    /**
     * @param n Количество страниц
     * @return Найти названия книг, в которых простое количество страниц,
     * фамилия автора содержит «А» и год издания после 2010 г, включительно.
     * @apiNote Сведения о книге состоят из названия, фамилии автора,
     * цены, года издания и количества страниц.
     */

    public static boolean primeNum(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
