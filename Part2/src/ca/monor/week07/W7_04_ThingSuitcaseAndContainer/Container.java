package ca.monor.week07.W7_04_ThingSuitcaseAndContainer;

import java.util.ArrayList;

public class Container {
    private int maxWeightLimit;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.isTooHeavy(suitcase)) {
            this.suitcases.add(suitcase);
        }
    }

    public boolean isTooHeavy(Suitcase suitcase) {
        return totalWeight() + suitcase.totalWeight() <= this.maxWeightLimit;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase s :
                this.suitcases) {
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Suitcase s :
                this.suitcases) {
            s.printThings();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitecases (" + totalWeight() + " kg)";
    }
}