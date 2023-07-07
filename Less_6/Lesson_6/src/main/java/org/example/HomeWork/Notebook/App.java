package org.example.HomeWork.Notebook;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Echips Envy", 8, 240, "Windows 10",
                "серебристый", 15);
        Laptop laptop2 = new Laptop("Dream Machines", 8, 500, "без ОС",
                "черный", 14);
        Laptop laptop3 = new Laptop("Apple MacBook Air 13", 8, 1000, "MacOs",
                "серый", 13);
        Laptop laptop4 = new Laptop("Dell G15", 8, 1000, "Linux",
                "черный", 15);
        Laptop laptop5 = new Laptop("HUAWEI MateBook D16", 16, 512, "Windows 11",
                "серый", 16);
        Laptop laptop6 = new Laptop("ASUS ROG Strix G15", 32, 1000, "без ОС",
                "серый", 15);
        Laptop laptop7 = new Laptop("MSI Raider GE78", 32, 2000, "Windows 11",
                "черный", 17);

        HashSet<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3,
                laptop4, laptop5, laptop6, laptop7));

        HashSet<Laptop> res = new HashSet<>();
        System.out.print("""
                Введите цифру, соответствующую необходимому критерию:\s
                 1 - ОЗУ\s
                 2 - Объем ЖД\s
                 3 - Операционная система\s
                 4 - Цвет\s
                 5 - Диагональ\s
                 или 6, чтобы осуществить поиск
                """);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 6) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("ram", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("storageCap", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("os", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            if (n == 5) {
                System.out.println("Введите диагональ");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("diagonal", temp);
            }
            System.out.print("""
                    Введите цифру, соответствующую необходимому критерию:\s
                     1 - ОЗУ\s
                     2 - Объем ЖД\s
                     3 - Операционная система\s
                     4 - Цвет\s
                     5 - Диагональ\s
                     или 6, чтобы осуществить поиск\s
                    """);
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("ram")) {
                for (Laptop laptop : laptops) {
                    if (laptop.getRam() >= (Integer) entry.getValue()) {
                        res.add(laptop);
                    }
                }
            }
            if (entry.getKey().equals("storageCap")) {
                for (Laptop laptop : laptops) {
                    if (laptop.getStorageCap() >= (Integer) entry.getValue()) {
                        res.add(laptop);
                    }
                }
            }
            if (entry.getKey().equals("os")) {
                for (Laptop laptop : laptops) {
                    if (laptop.getOs().equals(entry.getValue())) {
                        res.add(laptop);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                for (Laptop laptop : laptops) {
                    if (laptop.getColor().equals(entry.getValue())) {
                        res.add(laptop);
                    }
                }
            }
            if (entry.getKey().equals("diagonal")) {
                for (Laptop laptop : laptops) {
                    if (laptop.getDiagonal() >= (Integer) entry.getValue()) {
                        res.add(laptop);
                    }
                }
            }
        }

        for (Laptop laptop : res) {
            System.out.println(laptop.toString());
            System.out.println();
        }
    }
}