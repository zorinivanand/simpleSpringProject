package ru.zorinivan.simplespringproject2;

public class Bean {
    private static String name;
    private static int year;

    public Bean(int year){this.year = year;}
    public static int getYear() {return year;}
    public static void setYear(int year) {Bean.year = year;}

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
