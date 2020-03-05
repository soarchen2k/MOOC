package ca.monor.week10.w10_30_Container.cours.anotherExamplePoints;

public class ColouredPoint extends Point {
    private String colour;

    public ColouredPoint(int x, int y, String colour) {
        super(x, y);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + " colour: " + colour;
    }
}
