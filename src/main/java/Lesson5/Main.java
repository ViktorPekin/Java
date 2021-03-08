package Lesson5;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Васька", "Серый", 8);
        Cat cat2 = new Cat("Борис", "Рыжий");
        Cat cat3 = new Cat("Асолька");

        cat1.incAge();

        cat2.setAge(10);

        cat3.setAge(-5);

/*
        cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();
*/


      //  Cat[] cats = new Cat[3];

        System.gc();
        Cat[] cats = {cat1, cat2, cat3};

        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();

        }

    }
}
