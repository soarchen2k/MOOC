package ca.monor.week07.W7_08_Airport;

public class Airplane {
    private String planeId;
    private int planeCapacity;

    public Airplane() {
    }

    public Airplane(String planeId, int planeCapacity) {
        this.planeId = planeId;
        this.planeCapacity = planeCapacity;
    }

    public String getPlaneId() {
        return planeId;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    @Override
    public String toString() {
        return planeId + " (" + planeCapacity + " ppl)";
    }
}
