package monor.week06.exercise103_Birdwatcher;

public class Bird {
    String name;
    String latinName;
    int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObserved() {
        return observed;
    }

    public void setObserved(int observed) {
        this.observed = observed;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " +
                observed + " observations";
    }
}
