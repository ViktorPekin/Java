package lesson8.Homework;

public class Cat implements Player {
    private String name;
    private int speedRun;
    private int heightJump;

    public Cat(String name, int speedRun, int heightJump) {
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
    public void jump(int h) {

    }

    @Override
    public void flee() {

    }
}
