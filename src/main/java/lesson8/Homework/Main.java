package lesson8.Homework;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 15,20);
        Human human = new Human("Владимир", 25, 10);
        Robot robot = new Robot("Андроид", 10, 22);

        Tread tread = new Tread(16);
        Wall wall = new Wall(19);

        cat.jump();


    }
}
