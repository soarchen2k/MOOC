package monor.week05.exercise084_OverLoadedCounter;

public class Counter {
    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
//        this.startingValue = startingValue;
//        this.check = false;
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.startingValue;
    }

    public int getStartingValue() {
        return startingValue;
    }

    public void setStartingValue(int startingValue) {
        this.startingValue = startingValue;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.startingValue += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return;
        }
        this.startingValue -= decreaseAmount;
        if (this.check && this.startingValue < 0) {
            this.startingValue = 0;
        }


//        if (this.check ==true&& this.startingValue - decreaseAmount >= 0 && decreaseAmount >= 0) {
//            this.startingValue -= decreaseAmount;
//        } else if (this.check == false && decreaseAmount >= 0) {
//                this.startingValue -= decreaseAmount;
//        } else if (this.check = true && this.startingValue - decreaseAmount < 0) {
//            this.startingValue = 0;
//        } else if (decreaseAmount < 0) {
//            this.startingValue += 0;
//        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "startingValue=" + startingValue +
                '}';
    }
}
