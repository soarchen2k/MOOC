package ca.monor.week10.w10_30_Container.containers;

public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    @Override
    public String toString() {
        return this.getName()+": volume = " + this.getVolume() + ", free space " + this.getCurrentCapacity();
    }
}
