package ca.monor.week10.w10_30_Container.cours.exampleOfInheritanceMisuse;

public class Order {
    private Customer customer;
    private String product;
    private String amount;

    public Order(Customer customer, String product, String amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public String getAmount() {
        return amount;
    }

    public String mailingAddress() {
        return this.customer.getName() + "\n" + this.customer.getAddress();
    }
}
