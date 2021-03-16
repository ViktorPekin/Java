package lesson8.Homework;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 2,20);
        cat.setName("Pumba");
        Human human = new Human("Владимир", 25, 10);
        Robot robot = new Robot("Андроид", 5, 5);

        Tread tread = new Tread(14);
        Wall wall = new Wall(19);
        Wall wall1 = new Wall(3);

        Player[] players = {
                cat,
                human,
                robot
        };
        Barrier[] barrier = {
                tread,
                wall,
                wall1
        };
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < barrier.length; j++) {
                    if (barrier[j] instanceof Tread ) {
                        players[i].flee(barrier[j].getWidth());
                    } else {
                        players[i].jump(barrier[j].getHeight());
                    }
                }
            }
        }
}
