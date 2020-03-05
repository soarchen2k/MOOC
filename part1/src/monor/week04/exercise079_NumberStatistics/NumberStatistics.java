package monor.week04.exercise079_NumberStatistics;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {

    }

    public void addNumber(int number) {
        this.sum += number;
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        if (amountOfNumbers == 0) {
            return 0;
        }
        return this.sum;
    }

    public double average() {
        if (amountOfNumbers == 0) {
            return 0;
        } else {
            return (double) this.sum / amountOfNumbers;
        }
    }
}
