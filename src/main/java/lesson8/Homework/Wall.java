package lesson8.Homework;

public class Wall implements Barrier, RunBarrier {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean runBarrier(Player players) {
        return players.jump(height);
    }
}
