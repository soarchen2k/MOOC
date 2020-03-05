package monor.week05.exercise089_ClockObject;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int value, int upperLimit) {
        this.value = value;
        this.upperLimit = upperLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value < 0 || value > upperLimit ? 0 : value;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
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
        return "" + value;
    }
}