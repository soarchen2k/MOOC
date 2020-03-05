package monor.week04.exercise074_Multiplier;

public class Multiplier {
    private int multiplier;

    public Multiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int multiply(int otherNumber) {
        return otherNumber * multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
