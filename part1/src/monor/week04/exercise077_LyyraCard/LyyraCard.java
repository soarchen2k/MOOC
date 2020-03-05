package monor.week04.exercise077_LyyraCard;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4) {
            this.balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        if (this.balance + amount <= 150 && amount > 0) {
            this.balance += amount;
        } else if (amount < 0) {
        } else {
            this.balance = 150;
        }
    }
}
