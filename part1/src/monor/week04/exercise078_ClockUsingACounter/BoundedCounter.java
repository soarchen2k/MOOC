package monor.week04.exercise078_ClockUsingACounter;

public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value < 0 || value > upperLimit ? 0 : value;
    }

    public void next() {
        value++;
        if (value > upperLimit) {
            value = 0;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return ""+value;
    }
}
