package Lesson6.Homework;

public abstract class Animal {
    protected String name;
    static int number;

    public Animal(String name) {
        this.name = name;
        number++;
    }

    public abstract void run(int n);

    public abstract void sail(int n);

}
