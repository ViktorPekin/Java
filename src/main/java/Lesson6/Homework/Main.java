package Lesson6.Homework;

public class Main {
    public static void main(String[] args) {
        Cat cats = new Cat("Васька");
        Dog dogs = new Dog("Рэкс");
        Dog dogs2 = new Dog("Рэк");
        System.out.println("Количество животных : " + Animal.number);
        System.out.println("Количество котов : " + Cat.number);
        System.out.println("Количество собак : " + Dog.number);

        cats.run(150);
        cats.sail(3);
        dogs.run(520);
        dogs.sail(7);
    }
}
