package ca.monor.week07.W7_04_ThingSuitcaseAndContainer;

public class Thing {
    private String name;
    private int weight;

    public Thing() {
    }

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
