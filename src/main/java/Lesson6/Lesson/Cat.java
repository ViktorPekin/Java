package Lesson6.Lesson;

public final class Cat extends Animal {


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Мяу мяу");
    }



}
