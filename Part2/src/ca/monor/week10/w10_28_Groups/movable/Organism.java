package ca.monor.week10.w10_28_Groups.movable;

public class Organism implements Movable {
    private int x;
    private int y;

    public Organism() {
    }

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
