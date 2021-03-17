package lesson8.Homework;

public class Tread implements Barrier, RunBarrier{
    private final int width;

    public Tread(int width) {
        this.width = width;
    }

    @Override
    public boolean runBarrier(Player players) {
        return players.flee(width);
    }
}
