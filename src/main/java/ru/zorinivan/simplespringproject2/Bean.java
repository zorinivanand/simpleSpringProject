package ru.zorinivan.simplespringproject2;

public class Bean {
    private static String name;



    public Bean(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
