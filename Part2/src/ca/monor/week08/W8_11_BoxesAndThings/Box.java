package ca.monor.week08.W8_11_BoxesAndThings;

import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maximumWeight;
    private ArrayList<ToBeStored> toBeStoreds = new ArrayList<ToBeStored>();

    public Box() {
    }

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void add(ToBeStored toBeStored) {
        if (this.weight() + toBeStored.weight() <= maximumWeight) {
            this.toBeStoreds.add(toBeStored);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored t :
                this.toBeStoreds) {
            weight += t.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.toBeStoreds.size() + " things, total weight " + this.weight() + " kg";
    }
}
