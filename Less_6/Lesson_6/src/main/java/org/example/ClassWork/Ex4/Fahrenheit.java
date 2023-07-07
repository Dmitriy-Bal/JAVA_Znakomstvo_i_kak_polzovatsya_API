package org.example.ClassWork.Ex4;

public class Fahrenheit implements Converter{
    @Override
    public double converterValue(double baseValue) {
        return baseValue * 1.8 + 32;
    }
}
