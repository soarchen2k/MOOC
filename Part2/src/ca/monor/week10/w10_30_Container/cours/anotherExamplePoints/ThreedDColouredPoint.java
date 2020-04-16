package ca.monor.week10.w10_30_Container.cours.anotherExamplePoints;

public class ThreedDColouredPoint extends ThreeDPoint {
    private String colour;

    public ThreedDColouredPoint(int x, int y, int z, String colour) {
        super(x, y, z);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + " colour: " + colour;
    }
}
