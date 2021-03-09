package Lesson6.Lesson;

import java.util.Random;

public class Main extends Object {

    public static void main(String[] args) {

        Animal cat = new Cat("Мартин");
        Dog dog = new Dog("Гендальф", "Серый", 10, true);
        Duck duck = new Duck("Дональд Дак");

/*        cat.voice();
        dog.voice();

        cat.printInfo();
        dog.printInfo();*/
//        duck.fly();

//        Animal animal = new Animal("Чудо-юдо");

        Animal[] animals = {duck, cat, dog};

        for (int i = 0; i < animals.length; i++) {
            animals[i].printInfo();
            if (animals[i] instanceof Duck) {
                ((Duck) animals[i]).fly();
            }
        }

//        doVoice(duck);

        Object[] objects = {new String("String"), cat, new int[]{1, 1, 1, 1, 0}, new Random()};

       /* for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }*/
    }

    public static void doVoice(Animal animal) {
        animal.voice();
    }

}
