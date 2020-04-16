package ca.monor.week10.w10_30_Container.cours.anotherExamplePoints;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected String location(){
        return x + ", " + y;
    }

    public int manhattanDistanceFromOrigin(){
        return Math.abs(x)+Math.abs(y);
    }

    @Override
    public String toString() {
        return "("+this.location()+") distance "+this.manhattanDistanceFromOrigin();
    }
}
