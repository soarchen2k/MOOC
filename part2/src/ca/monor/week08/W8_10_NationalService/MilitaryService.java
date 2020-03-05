package ca.monor.week08.W8_10_NationalService;

public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (this.getDaysLeft() > 0) {
            this.daysLeft--;
        }
    }
}
