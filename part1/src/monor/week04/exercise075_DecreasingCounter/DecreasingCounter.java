package monor.week04.exercise075_DecreasingCounter;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int valueInitial;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.valueInitial = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    // and here the rest of the methods

    public void setInitial() {
        this.value = this.valueInitial;
    }

}

