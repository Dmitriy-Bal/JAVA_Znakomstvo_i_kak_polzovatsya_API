package org.example.ClassWork;

public class Ex3 {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2, 3);
//        Vector vector = new Vector();
//        vector.x = 0;
//        vector.y = 1;
//        vector.z = 2;
        System.out.println("vector.vectorLength() = " + vector.vectorLength());
        Vector vector2 = new Vector(1, 1, 1);
        System.out.println("vector.scalar(vector2) = " + vector.scalar(vector2));
        System.out.println("vector.vectorMulti(vector2) = " + vector.vectorMulti(vector2));
        System.out.println("vector.kosVector(vector2) = " + vector.kosVector(vector2));
        System.out.println("vector.sum(vector2) = " + vector.sum(vector2));
        System.out.println("vector.diff(vector2) = " + vector.diff(vector2));
        System.out.println(vector);
    }
}