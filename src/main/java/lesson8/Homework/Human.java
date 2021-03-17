package lesson8.Homework;

public class Human implements Player{
    private String name;
    private int speedRun;
    private int heightJump;

    public Human(String name, int speedRun, int heightJump) {
        this.name = name;
        this.speedRun = speedRun;
        this.heightJump = heightJump;
    }

    public String getName() {
        return name;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public void setHeightJump(int heightJump) {
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
