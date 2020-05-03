package ca.monor.week10.w10_31_FarmSimulator.farmsimulator.farm;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        this.volume = Math.min(this.volume + amount, capacity);
    }

    public double getFromTank(double amount) {
        if (amount >= volume) {
            amount = volume;
            this.volume = 0d;
        } else {
            this.volume -= amount;
        }
        return amount;
    }

    @Override
    public String toString() {
        return "BulkTank{" +
                "capacity=" + capacity +
                ", volume=" + volume +
                '}';
    }
}
