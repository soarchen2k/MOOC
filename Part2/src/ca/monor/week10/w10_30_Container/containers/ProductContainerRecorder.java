package ca.monor.week10.w10_30_Container.containers;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory containerHistory;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        containerHistory = new ContainerHistory(); // 先建立新对象
        addToTheContainer(initialVolume);  // 执行 addTo 方法的时候，初始 volume 值就会被加入 List
    }

    public String history() {
        return containerHistory.toString();
    }

    // 以下两个 Method 都与父类不同，需要重写
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        containerHistory.add(getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double take = super.takeFromTheContainer(amount);  // 因爲本类中有take方法，需要声明 super
        containerHistory.add(getVolume());
        return take;
    }

    // 因爲 变量和方法都与父类不同，需要重写以获取本类的变量与方法
    @Override
    public String toString() {
        return "volume = " + getVolume() + ", free space " + getCurrentCapacity();
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + containerHistory.toString());
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: " + containerHistory.variance());
    }
}
