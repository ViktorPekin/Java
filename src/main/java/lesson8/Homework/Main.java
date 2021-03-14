package lesson8.Homework;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 15,20);
        cat.setName("Pumba");
        Human human = new Human("Владимир", 25, 10);
        Robot robot = new Robot("Андроид", 10, 22);

        Tread tread = new Tread(16);
        Wall wall = new Wall(19);

        Player[] players = {
                cat,
                human,
                robot
        };

        for (int i = 0; i < players.length; i++) {
            players[i].jump(wall.getHeight());
        }





//        cat.jump();


    }
}
