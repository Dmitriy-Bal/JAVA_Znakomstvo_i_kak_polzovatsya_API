package org.example.ClassWork.Ex4;

import org.example.ClassWork.Ex3.Cube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "красный", "деревянный");
        Cube cube2 = new Cube(4, "жёлтый", "металлический");
        Cube cube3 = new Cube(4, "жёлтый", "металлический");
        Cube cube4 = new Cube(4, "жёлтый", "металлический");

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println(cubeList);
        Integer k = 0;
        Integer sumVolume = 0;
        Integer kWood = 0;

        for (Cube cube : cubeList) {
            if (cube.getColor().equals("жёлтый")) {
                k++;
//                Integer volCube = cube.getSize() * cube.getSize() * cube.getSize();
//                sumVolume += volCube;
                sumVolume += cube.volumeCube();
            }
            if (cube.getMaterial().equals("деревянный") && cube.getSize() == 3) {
                kWood++;
            }
        }
        System.out.println(k);
        System.out.println(sumVolume);
        System.out.println(kWood);

        // Напишите метод, который на вход получает коллекцию объектов, а
        // возвращает коллекцию уже без дубликатов.
        System.out.println(unicCollection(cubeList));
    }

    private static Collection unicCollection(List<Cube> cubeList) {
        return new HashSet<>(cubeList);
    }
}
