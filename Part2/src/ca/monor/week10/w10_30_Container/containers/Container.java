package ca.monor.week10.w10_30_Container.containers;

public class Container {
    private double capacity;
    private double volume;  // 当前占用的容量

    public Container(double capacity) {
        this.capacity = Math.max(capacity, 0.0);
        this.volume = 0.0;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getOriginalCapacity() {
        return this.capacity;
    }

    public double getCurrentCapacity() {
        return this.capacity - this.volume;
    }

    // 它将指定数量的内容添加到容器中。如果数量是负数，则没有变化;
    // 如果这个数量的一部分适合，但不是全部，容器就被装满了，剩下的就被扔掉了。
    public void addToTheContainer(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= getCurrentCapacity()) {
            this.volume = this.volume + amount;
        } else {
            this.volume = this.capacity;
        }
    }

    //我们从容器中获取指定的金额，该方法返回我们接收到的内容。
    // 如果指定的数量是负数，则什么也不会发生，返回零。
    // 如果我们要求容器中有更多的内容，该方法将返回所有内容。

    public double takeFromTheContainer(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.volume) {
            double everything = this.volume;
            this.volume = 0.0;
            return everything;
        }

        this.volume = this.volume - amount;
        return amount;
    }

    @Override
    public String toString() {
        return "volume = " + this.volume + ", free space " + getCurrentCapacity();
    }
}