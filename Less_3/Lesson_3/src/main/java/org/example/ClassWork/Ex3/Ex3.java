package org.example.ClassWork.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "красный", "деревянный");
        Cube cube2 = new Cube(4, "жёлтый", "металлический");
        Cube cube3 = new Cube(5, "злёный", "металлический");
        Cube cube4 = new Cube(10, "жёлтый", "стальной");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println(cubeList);
        // - количество кубиков желтого цвета и их суммарный объем;
        // - количество деревянных кубиков с ребром 3 см
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
    }
}
