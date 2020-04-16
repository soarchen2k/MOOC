package ca.monor.week08.W8_10_NationalService;

public class CivilService implements NationalService{
    private int daysLeft = 362;
    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if (this.getDaysLeft() > 0) {
            this.daysLeft--;
        }
    }
}
