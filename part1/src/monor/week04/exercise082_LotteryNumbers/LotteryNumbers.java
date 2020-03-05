package monor.week04.exercise082_LotteryNumbers;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {

        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int number = 0;
        // Write the number drawing here using the method containsNumber()
        while (this.numbers.size() < 7) {
            number = random.nextInt(39) + 1;
            if (!containsNumber(number)) {
                this.numbers.add(number);
            } else continue;
        }
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else return false;
    }
}