package lesson8.Homework;

public class Wall implements Barrier{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
