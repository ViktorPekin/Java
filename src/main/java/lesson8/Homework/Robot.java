package lesson8.Homework;

public class Robot implements Player{
    private String name;
    private int speedRun;
    private int heightJump;

    public Robot(String name, int speedRun, int heightJump) {
        this.name = name;
        this.speedRun = speedRun;
        this.heightJump = heightJump;
    }

    @Override
    public boolean jump(int h) {
        if (h < heightJump) {
            System.out.println(name + " перепрыгнул");
            return true;
        } else {
            System.out.println(name + " не перепрыгнул");
            return false;
        }
    }

    @Override
    public boolean flee(int b) {
        if (b < speedRun) {
            System.out.println(name + " пробежал");
            return true;
        } else {
            System.out.println(name + " не пробежал");
            return false;
        }
    }
}
