package org.example.HomeWork.DZ1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ex1 {
    public static void main(String[] args) {
        Product product1 = new Product("Сыр", 1400.01, 1);
        Product product2 = new Product("Йогурт", 20.02, 2);
        Product product3 = new Product("Масло", 600.03, 3);
        Product product4 = new Product("Молоко 'высший'", 100.04, 1);
        Product product5 = new Product("Сливки 'высший'", 900.05, 2);
        Product product6 = new Product("Творог 'высший'", 600.06, 3);

        /**
         * @apiNote Дан массив записей: наименование товара, цена, сорт.
         * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров,
         * название которых содержит «высший».
         */

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        String searchName = "'высший'";
        Double maxPrice = 0.0;
        String maxPriceNameGrade = "";

        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(searchName) && (product.getGrade()) == 1 || product.getGrade() == 2) {
                if (maxPrice < product.getPrice()) {
                    maxPrice = product.getPrice();
                }
            }
        }

        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(searchName) && (product.getGrade()) == 1 || product.getGrade() == 2) {
                if (Objects.equals(product.getPrice(), maxPrice)) {
                    maxPriceNameGrade += product.getName();
                }
            }
        }
        System.out.println("Наибольшая цена: " + maxPrice + "\n" + "На товар: " + maxPriceNameGrade);
    }
}
