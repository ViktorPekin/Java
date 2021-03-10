package Lesson5;

import java.util.Locale;

public class Cat {

    private String name;
    private String color;
    private int age;
    private static int catsCount;

    public Cat(String name, String color, int age) {
        this.name = name.toUpperCase();
        this.color = color;
        this.age = age;

        System.out.printf("Я родился! Меня зовут: %s, всего котов: %d%n", name, ++catsCount);
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public Cat(String name, String color) {
        this(name, color, 0);
    }

    public Cat(String name) {
        this(name, null);
    }

    void printInfo() {
        //System.out.println("Имя кота: " + name + ", цвет: " + color + ", возраст: " + age);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Имя кота: " + name + ", цвет: " + color + ", возраст: " + age;
    }

    public void incAge() {
        age++;
    }

    public  void setAge(int age) {
        if(age >= 0 && age < 30) {
            this.age = age;
        } else {
            System.err.println("Неверный возраст");
        }
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
