package org.example.HomeWork.DZ2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Products products1 = new Products("Сыр", "Россия", 10, 1000.01, 1);
        Products products2 = new Products("Йогурт", "Казахстан", 15, 20.02, 1);
        Products products3 = new Products("Масло", "Белоруссия", 25, 20.02, 1);
        Products products4 = new Products("Молоко", "Россия", 100, 100.04, 1);
        Products products5 = new Products("Сливки", "Филиппины", 10, 900.05, 2);
        Products products6 = new Products("Творог", "Армения", 10, 600.06, 3);

        /**
         * @apiNote Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
         * Получить наименования товаров заданного сорта с наименьшей ценой.
         */

        List<Products> productsList = new ArrayList<>();
        productsList.add(products1);
        productsList.add(products2);
        productsList.add(products3);
        productsList.add(products4);
        productsList.add(products5);
        productsList.add(products6);

        int whichGrade = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите сорт товара от 1-го до 3-го (включительно): ");
        String grade = scanner.nextLine();
        if (Integer.parseInt(grade) >= 1 && Integer.parseInt(grade) <= 3)
            whichGrade = Integer.parseInt(grade);
        else System.out.println("Не верный ввод. \nПопробуйте ещё раз. \nВведите цифру: 1, 2 или 3");

        double minPrice = productsList.get(0).getPrice();
        for (Products products : productsList) {
            if (products.getGrade().equals(whichGrade)) {
                if (products.getPrice() < minPrice) {
                    minPrice = products.getPrice();
                }
            }
        }
        StringBuilder whichNames = new StringBuilder();
        for (Products products : productsList) {
            if (products.getGrade().equals(whichGrade) && (products.getPrice() == minPrice)) {
                whichNames.append(products.getName()).append("\n");
            }
        }
        System.out.println("Наименования товаров (" + grade + "-го сорта), с наименьшей ценой: " + "\n" + whichNames);
    }
}
