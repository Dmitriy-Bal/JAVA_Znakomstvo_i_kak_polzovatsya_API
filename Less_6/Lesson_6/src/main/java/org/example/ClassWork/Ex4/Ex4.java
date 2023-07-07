package org.example.ClassWork.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        double temp = 0.0;
        System.out.println("temp C = " + new Celsius().converterValue(temp));
        System.out.println("temp K = " + new Kelvin().converterValue(temp));
        System.out.println("temp F = " + new Fahrenheit().converterValue(temp));
        
    }
}
