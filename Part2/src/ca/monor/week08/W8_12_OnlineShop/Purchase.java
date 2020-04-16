package ca.monor.week08.W8_12_OnlineShop;

public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public Purchase(String product, int unitPrice) {
        this.product = product;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return (this.amount * this.unitPrice);
    }

    public void increaseAmount() {
        amount++;
    }

    @Override
    public String toString() {
        return product + ": " + amount;
    }
}
