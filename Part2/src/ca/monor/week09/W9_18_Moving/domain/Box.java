package ca.monor.week09.W9_18_Moving.domain;

import ca.monor.week09.W9_18_Moving.Thing;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> things = new ArrayList<Thing>();


    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maximumCapacity) {
            this.things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for (Thing thing : this.things) {
            currentVolume += thing.getVolume();
        }
        return currentVolume;    }
}
