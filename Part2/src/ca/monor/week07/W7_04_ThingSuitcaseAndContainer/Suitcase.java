package ca.monor.week07.W7_04_ThingSuitcaseAndContainer;

import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {
    private final int maximumWeightLimit;
    private ArrayList<Thing> things;

    public Suitcase(int maximumWeightLimit) {
        this.things = new ArrayList<Thing>();
        this.maximumWeightLimit = maximumWeightLimit;
    }

    public void addThing(Thing thing) {
        if (isTooHeavy(thing)) {
            things.add(thing);
        }
    }

    public boolean isTooHeavy(Thing thing) {
        return (totalWeight() + thing.getWeight() <= maximumWeightLimit);
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        if (this.things.size() == 0) {
            return "empty (0 kg)";
        }
        if (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.totalWeight()+" kg)";
        }
        return this.things.size() + " things (" + this.totalWeight()+" kg)";
    }

    public void printThings() {
        for (Thing thing :
                this.things) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {
        if (this.things.isEmpty()) {
            return null;
        }
        Thing thing = new Thing();
        for (Thing t :
                this.things) {
            if (thing.getWeight() < t.getWeight()) {
                thing = t;
            }
        }
//        things.sort(Comparator.comparing(thing1 -> thing1.getWeight()));
//        return things.get(things.size() - 1);
        return thing;
    }
}
