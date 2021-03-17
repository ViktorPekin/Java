package lesson8.Homework;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 19, 16);
        Human human = new Human("Владимир", 25, 10);
        Robot robot = new Robot("Андроид", 6, 5);

        Tread tread = new Tread(14);
        Wall wall = new Wall(7);

        Player[] players = {
                cat,
                human,
                robot
        };
        Barrier[] barrier = {
                tread,
                wall
        };
        for (Player player : players) {
            for (Barrier value : barrier) {
                if (!value.runBarrier(player)) {
                    break;
                }
            }
        }
    }
}
