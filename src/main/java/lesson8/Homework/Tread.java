package lesson8.Homework;

public class Tread implements Barrier{
    private int width;

    public Tread(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
