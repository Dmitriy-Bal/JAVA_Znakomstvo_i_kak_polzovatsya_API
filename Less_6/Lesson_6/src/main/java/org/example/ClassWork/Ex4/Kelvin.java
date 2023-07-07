package org.example.ClassWork.Ex4;

public class Kelvin implements  Converter{
    @Override
    public double converterValue(double baseValue) {
        return baseValue + 273.15;
    }
}
