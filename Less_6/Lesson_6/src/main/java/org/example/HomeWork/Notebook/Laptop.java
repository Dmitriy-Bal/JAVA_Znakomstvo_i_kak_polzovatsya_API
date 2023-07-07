package org.example.HomeWork.Notebook;


public class Laptop {
    private final String name;
    private final int ram;
    private final int storageCap;
    private final String os;
    private final String color;
    private final int diagonal;

    public Laptop(String name, int ram, int storageCap, String os, String color, int diagonal) {
        //this.id = counter++;
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб " +
                        "\n ОС %s \n Цвет %s \n Диагональ %d \n",
                this.name, this.ram, this.storageCap, this.os, this.color, this.diagonal);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop) {
            return this.name.equals(((Laptop) obj).name) && this.ram == ((Laptop) obj).ram
                    && this.storageCap == ((Laptop) obj).storageCap && this.os.equals(((Laptop) obj).os)
                    && this.color.equals(((Laptop) obj).color) && this.diagonal == ((Laptop) obj).diagonal;
        }
        return false;
    }

    public Integer getRam() {
        return this.ram;
    }

    public Integer getStorageCap() {
        return this.storageCap;
    }

    public String getOs() {
        return this.os;
    }

    public String getColor() {
        return this.color;
    }

    public Integer getDiagonal() {
        return this.diagonal;
    }
}


