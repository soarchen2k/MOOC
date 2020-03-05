package monor.week05.exercise086_LyyraCardAndCashRegister;

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double economicalPrice = 2.5;
    private final double gourmetPrice = 4;

    public CashRegister() {
        this.cashInRegister = 1000;
        // at start the register has 1000 euros
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven < economicalPrice) {
            return cashGiven;
        }
        this.cashInRegister += economicalPrice;
        economicalSold++;
        return cashGiven - economicalPrice;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven < gourmetPrice) {
            return 0;
        }
        this.cashInRegister += gourmetPrice;
        gourmetSold++;
        return cashGiven - gourmetPrice;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.pay(economicalPrice)) {
            economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.pay(gourmetPrice)) {
            gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            cashInRegister += sum;
            card.loadMoney(sum);
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
